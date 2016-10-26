package org.hisp.dhis.client.models.trackedentity;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.hisp.dhis.client.models.Inject;
import org.hisp.dhis.client.models.common.BaseIdentifiableObject;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackedEntityInstanceIntegrationTest {

    @Test
    public void trackedEntityInstance_shouldMapFromJsonString() throws IOException, ParseException {
        ObjectMapper objectMapper = Inject.objectMapper();
        TrackedEntityInstance trackedEntityInstance = objectMapper.readValue("{\n" +
                "\n" +
                "    \"lastUpdated\": \"2014-03-28T12:39:39.372+0000\",\n" +
                "    \"trackedEntity\": \"nEenWmSyUEp\",\n" +
                "    \"created\": \"2014-03-26 15:50:14.381\",\n" +
                "    \"orgUnit\": \"DiszpKrYNg8\",\n" +
                "    \"trackedEntityInstance\": \"CVUuL8RIpPI\",\n" +
                "    \"relationships\": [ ],\n" +
                "    \"attributes\": [\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"TB number\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"ruQQnf6rswq\",\n" +
                "            \"value\": \"1Z 471 141 26 5916 841 0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"MMD_PER_NAM\",\n" +
                "            \"displayName\": \"First name\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"w75KJ2mc4zz\",\n" +
                "            \"value\": \"Makda\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"MMD_PER_ADR1\",\n" +
                "            \"displayName\": \"Address\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"VqEFza8wbwA\",\n" +
                "            \"value\": \"884 Oxford St\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"State\",\n" +
                "            \"displayName\": \"State\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"NUMBER\",\n" +
                "            \"attribute\": \"GUOBQt5K2WI\",\n" +
                "            \"value\": \"Western Cape\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Company\",\n" +
                "            \"displayName\": \"Company\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"kyIzQsj96BD\",\n" +
                "            \"value\": \"Price Club\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Vehicle\",\n" +
                "            \"displayName\": \"Vehicle\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"VHfUeXpawmE\",\n" +
                "            \"value\": \"2005 Audi TT\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Occupation\",\n" +
                "            \"displayName\": \"Occupation\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"A4xFHyieXys\",\n" +
                "            \"value\": \"Human resources director\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Height in cm\",\n" +
                "            \"displayName\": \"Height in cm\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"NUMBER\",\n" +
                "            \"attribute\": \"lw1SqmMlnfh\",\n" +
                "            \"value\": \"155\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"Gender\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"cejWyOfXge6\",\n" +
                "            \"value\": \"Female\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Zip code\",\n" +
                "            \"displayName\": \"Zip code\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"NUMBER\",\n" +
                "            \"attribute\": \"n9nUvfpTsxQ\",\n" +
                "            \"value\": \"6625\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Mother maiden name\",\n" +
                "            \"displayName\": \"Mother maiden name\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"o9odfev2Ty5\",\n" +
                "            \"value\": \"Bisrat\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Longitude\",\n" +
                "            \"displayName\": \"Longitude\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"RG7uGl4w5Jq\",\n" +
                "            \"value\": \"22.236405\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"Last name\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"zDhUuAYrxNC\",\n" +
                "            \"value\": \"Dahlak\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"Weight in kg\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"NUMBER\",\n" +
                "            \"attribute\": \"OvY4VVhSDeJ\",\n" +
                "            \"value\": \"94.3\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Blood type\",\n" +
                "            \"displayName\": \"Blood type\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"H9IlTX2X6SL\",\n" +
                "            \"value\": \"A+\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"Latitude\",\n" +
                "            \"displayName\": \"Latitude\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"Qo571yj6Zcn\",\n" +
                "            \"value\": \"-33.522872\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"National identifier\",\n" +
                "            \"displayName\": \"National identifier\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"AuPLng5hLbE\",\n" +
                "            \"value\": \"234858622\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"Email\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"NDXw0cluzSw\",\n" +
                "            \"value\": \"MakdaDahlak@fleckens.hu\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"code\": \"City\",\n" +
                "            \"displayName\": \"City\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"TEXT\",\n" +
                "            \"attribute\": \"FO4sWYJ64LQ\",\n" +
                "            \"value\": \"Oudtshoorn\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"lastUpdated\": \"2016-01-12T09:10:35.884+0000\",\n" +
                "            \"displayName\": \"Phone number\",\n" +
                "            \"created\": \"2016-01-12T09:10:26.986+0000\",\n" +
                "            \"valueType\": \"PHONE_NUMBER\",\n" +
                "            \"attribute\": \"P2cwLGskgxn\",\n" +
                "            \"value\": \"084 596 1186\"\n" +
                "        }\n" +
                "    ]\n" +
                "\n" +
                "}", TrackedEntityInstance.class);

        assertThat(trackedEntityInstance.lastUpdated()).isEqualTo(
                BaseIdentifiableObject.DATE_FORMAT.parse("2014-03-28T12:39:39.372+0000"));
        assertThat(trackedEntityInstance.created()).isEqualTo(
                BaseIdentifiableObject.DATE_FORMAT.parse("2014-03-26 15:50:14.381"));
        assertThat(trackedEntityInstance.uid()).isEqualTo("nEenWmSyUEp");
        assertThat(trackedEntityInstance.organisationUnit()).isEqualTo("DiszpKrYNg8");
        assertThat(trackedEntityInstance.relationships()).isEmpty();

        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(0).trackedEntityAttribute().equals("ruQQnf6rswq"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(1).trackedEntityAttribute().equals("w75KJ2mc4zz"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(2).trackedEntityAttribute().equals("VqEFza8wbwA"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(3).trackedEntityAttribute().equals("GUOBQt5K2WI"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(4).trackedEntityAttribute().equals("kyIzQsj96BD"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(5).trackedEntityAttribute().equals("VHfUeXpawmE"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(6).trackedEntityAttribute().equals("A4xFHyieXys"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(7).trackedEntityAttribute().equals("lw1SqmMlnfh"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(8).trackedEntityAttribute().equals("cejWyOfXge6"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(9).trackedEntityAttribute().equals("n9nUvfpTsxQ"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(10).trackedEntityAttribute().equals("o9odfev2Ty5"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(11).trackedEntityAttribute().equals("RG7uGl4w5Jq"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(12).trackedEntityAttribute().equals("zDhUuAYrxNC"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(13).trackedEntityAttribute().equals("OvY4VVhSDeJ"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(14).trackedEntityAttribute().equals("H9IlTX2X6SL"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(15).trackedEntityAttribute().equals("Qo571yj6Zcn"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(16).trackedEntityAttribute().equals("AuPLng5hLbE"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(17).trackedEntityAttribute().equals("NDXw0cluzSw"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(18).trackedEntityAttribute().equals("FO4sWYJ64LQ"));
        assertThat(trackedEntityInstance.trackedEntityAttributeValues().get(19).trackedEntityAttribute().equals("P2cwLGskgxn"));


    }

}