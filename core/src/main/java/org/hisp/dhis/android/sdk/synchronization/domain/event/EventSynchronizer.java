package org.hisp.dhis.android.sdk.synchronization.domain.event;

import static android.R.attr.id;

import static org.hisp.dhis.android.sdk.persistence.models.FailedItem.EVENT;

import org.hisp.dhis.android.sdk.network.APIException;
import org.hisp.dhis.android.sdk.persistence.models.Event;
import org.hisp.dhis.android.sdk.persistence.models.FailedItem;
import org.hisp.dhis.android.sdk.persistence.models.ImportSummary;
import org.hisp.dhis.android.sdk.synchronization.domain.common.Synchronizer;
import org.hisp.dhis.android.sdk.synchronization.domain.faileditem.IFailedItemRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventSynchronizer extends Synchronizer{
    IEventRepository mEventRepository;
    IFailedItemRepository mFailedItemRepository;

    public EventSynchronizer(IEventRepository eventRepository,
            IFailedItemRepository failedItemRepository) {
        super(failedItemRepository);

        mEventRepository = eventRepository;
        mFailedItemRepository = failedItemRepository;
    }

    public void sync(Event event) {
        try {
            ImportSummary importSummary = mEventRepository.sync(event);

            if (ImportSummary.SUCCESS.equals(importSummary.getStatus()) ||
                    ImportSummary.OK.equals(importSummary.getStatus())) {

                event.setFromServer(true);
                mEventRepository.save(event);
                super.clearFailedItem(EVENT, event.getLocalId());

            } else if (ImportSummary.ERROR.equals(importSummary.getStatus())) {
                super.handleImportSummaryError(importSummary, EVENT, 200, id);
            }
        } catch (APIException api) {
            super.handleSerializableItemException(api, FailedItem.EVENT,
                    event.getLocalId());
        }
    }

    public void sync(List<Event> events) {
        try {
            Map<String, Event> eventsMapCheck = new HashMap<>();
            for (Event event : events) {
                eventsMapCheck.put(event.getUid(), event);
            }
            List<ImportSummary> importSummaries = mEventRepository.sync(events);

            for (ImportSummary importSummary : importSummaries) {
                Event event = eventsMapCheck.get(importSummary.getReference());
                if (ImportSummary.SUCCESS.equals(importSummary.getStatus()) ||
                        ImportSummary.OK.equals(importSummary.getStatus())) {
                    super.clearFailedItem(EVENT, event.getLocalId());
                } else if (ImportSummary.ERROR.equals(importSummary.getStatus())) {
                    super.handleImportSummaryError(importSummary, EVENT, 200,
                            event.getLocalId());
                }
            }
        } catch (APIException api) {
            //The sdk try to upload it event by event in this case
            for (Event event : events) {
                super.handleSerializableItemException(api, FailedItem.EVENT,
                        event.getLocalId());
            }
        }
    }
}
