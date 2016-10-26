package org.hisp.dhis.client.models.program;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.hisp.dhis.client.models.Inject;
import org.hisp.dhis.client.models.common.BaseIdentifiableObject;
import org.hisp.dhis.client.models.common.FormType;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgramStageIntegrationTest {

    @Test
    public void programStage_shouldMapFromJsonString() throws IOException, ParseException {
        ObjectMapper objectMapper = Inject.objectMapper();
        ProgramStage programStage = objectMapper.readValue("{\n" +
                "\n" +
                "    \"lastUpdated\": \"2013-04-10T12:15:02.041\",\n" +
                "    \"id\": \"eaDHS084uMp\",\n" +
                "    \"href\": \"https://play.dhis2.org/dev/api/programStages/eaDHS084uMp\",\n" +
                "    \"created\": \"2013-03-04T11:41:07.541\",\n" +
                "    \"name\": \"ANC 1st visit\",\n" +
                "    \"allowGenerateNextVisit\": false,\n" +
                "    \"validCompleteOnly\": false,\n" +
                "    \"displayName\": \"ANC 1st visit\",\n" +
                "    \"reportDateToUse\": \"false\",\n" +
                "    \"description\": \"ANC 1st visit\",\n" +
                "    \"externalAccess\": false,\n" +
                "    \"openAfterEnrollment\": false,\n" +
                "    \"repeatable\": false,\n" +
                "    \"captureCoordinates\": false,\n" +
                "    \"formType\": \"DEFAULT\",\n" +
                "    \"remindCompleted\": false,\n" +
                "    \"displayGenerateEventBox\": false,\n" +
                "    \"generatedByEnrollmentDate\": false,\n" +
                "    \"autoGenerateEvent\": true,\n" +
                "    \"sortOrder\": 1,\n" +
                "    \"hideDueDate\": false,\n" +
                "    \"blockEntryForm\": false,\n" +
                "    \"minDaysFromStart\": 0,\n" +
                "    \"access\": {\n" +
                "        \"read\": true,\n" +
                "        \"update\": true,\n" +
                "        \"externalize\": false,\n" +
                "        \"delete\": true,\n" +
                "        \"write\": true,\n" +
                "        \"manage\": false\n" +
                "    },\n" +
                "    \"program\": {\n" +
                "        \"id\": \"uy2gU8kT1jF\"\n" +
                "    },\n" +
                "    \"notificationTemplates\": [ ],\n" +
                "    \"programStageDataElements\": [\n" +
                "        {\n" +
                "            \"id\": \"EQCf1l2Mdr8\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"muxw4SGzUwJ\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"KWybjio9UZT\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"ejm0g2hwHHc\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"yvV3txhSCyc\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"fzQrjBpbwQD\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"BbvkNf9PCxX\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"MbdCfd4HaMQ\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"SBn4XCFRbyT\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"F0PZ4nZ86vo\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"gFBRqVFh60H\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"ljAoyjH4GYA\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"MAdsNY2gOlv\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"IpVUTCDdlGW\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"psBtdqepNVM\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"UzB6pZxZ2Rb\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"FQZEMbBVabW\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"translations\": [ ],\n" +
                "    \"userGroupAccesses\": [ ],\n" +
                "    \"attributeValues\": [ ],\n" +
                "    \"programStageSections\": [ ]\n" +
                "\n" +
                "}", ProgramStage.class);

        assertThat(programStage.lastUpdated()).isEqualTo(
                BaseIdentifiableObject.DATE_FORMAT.parse("2013-04-10T12:15:02.041"));
        assertThat(programStage.created()).isEqualTo(
                BaseIdentifiableObject.DATE_FORMAT.parse("2013-03-04T11:41:07.541"));

        assertThat(programStage.uid()).isEqualTo("eaDHS084uMp");
        assertThat(programStage.name()).isEqualTo("ANC 1st visit");
        assertThat(programStage.displayName()).isEqualTo("ANC 1st visit");
        assertThat(programStage.sortOrder()).isEqualTo(1);
        assertThat(programStage.allowGenerateNextVisit()).isFalse();
        assertThat(programStage.autoGenerateEvent()).isTrue();
        assertThat(programStage.blockEntryForm()).isFalse();
        assertThat(programStage.captureCoordinates()).isFalse();
        assertThat(programStage.displayGenerateEventBox()).isFalse();
        assertThat(programStage.executionDateLabel()).isNull();
        assertThat(programStage.formType()).isEqualTo(FormType.DEFAULT);
        assertThat(programStage.generatedByEnrollmentDate()).isFalse();
        assertThat(programStage.hideDueDate()).isFalse();
        assertThat(programStage.minDaysFromStart()).isEqualTo(0);
        assertThat(programStage.openAfterEnrollment()).isFalse();
        assertThat(programStage.repeatable()).isFalse();
        assertThat(programStage.reportDateToUse()).isEqualTo("false");
        assertThat(programStage.standardInterval()).isNull();
        assertThat(programStage.programStageSections()).isEmpty();

        assertThat(programStage.programStageDataElements().get(0).uid()).isEqualTo("EQCf1l2Mdr8");
        assertThat(programStage.programStageDataElements().get(1).uid()).isEqualTo("muxw4SGzUwJ");
        assertThat(programStage.programStageDataElements().get(2).uid()).isEqualTo("KWybjio9UZT");
        assertThat(programStage.programStageDataElements().get(3).uid()).isEqualTo("ejm0g2hwHHc");
        assertThat(programStage.programStageDataElements().get(4).uid()).isEqualTo("yvV3txhSCyc");
        assertThat(programStage.programStageDataElements().get(5).uid()).isEqualTo("fzQrjBpbwQD");
        assertThat(programStage.programStageDataElements().get(6).uid()).isEqualTo("BbvkNf9PCxX");
        assertThat(programStage.programStageDataElements().get(7).uid()).isEqualTo("MbdCfd4HaMQ");
        assertThat(programStage.programStageDataElements().get(8).uid()).isEqualTo("SBn4XCFRbyT");
        assertThat(programStage.programStageDataElements().get(9).uid()).isEqualTo("F0PZ4nZ86vo");
        assertThat(programStage.programStageDataElements().get(10).uid()).isEqualTo("gFBRqVFh60H");
        assertThat(programStage.programStageDataElements().get(11).uid()).isEqualTo("ljAoyjH4GYA");
        assertThat(programStage.programStageDataElements().get(12).uid()).isEqualTo("MAdsNY2gOlv");
        assertThat(programStage.programStageDataElements().get(13).uid()).isEqualTo("IpVUTCDdlGW");
        assertThat(programStage.programStageDataElements().get(14).uid()).isEqualTo("psBtdqepNVM");
        assertThat(programStage.programStageDataElements().get(15).uid()).isEqualTo("UzB6pZxZ2Rb");
        assertThat(programStage.programStageDataElements().get(16).uid()).isEqualTo("FQZEMbBVabW");

    }
}