package com.hub4techie.dsc.streamsetAPI;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.hub4techie.Utils.Library;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataCollectorDetails2 {

	final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
	final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
	final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();

	public DataCollectorResponse getDataCollectorDetails(String sdcId, String pipeline, String jobId) {

		DataCollectorResponse dcResponse = null;
		try {
			RestAssured.baseURI = streamsetBaseURI;
			RequestSpecification request = RestAssured.given();
			JSONObject requestParams = new JSONObject();
			requestParams.put("userName", streamsetUser);
			requestParams.put("password", streamsetPwd);
			request.contentType("application/json");
			request.header("X-Requested-By", "SCH");
			request.body(requestParams.toString());
			request.relaxedHTTPSValidation();
			Response response = request.post("/security/public-rest/v1/authentication/login");
			int statusCode = response.getStatusCode();
			String authToken = response.header("X-SS-User-Auth-Token");
			System.out.println("Status Code received is :" + statusCode);
			System.out.println("Response from service is as below:" + response.asString());
			System.out.println("Auth Token Received is : " + authToken);
			request.contentType("application/json");
			request.header("X-Requested-By", "SCH");
			request.header("X-SS-REST-CALL", "true");
			request.header("X-SS-User-Auth-Token", authToken);

			String sdcDetails = SdcId.getSdcDetails(sdcId);
			Gson gSon_SDC = new Gson();
			SDCDetails _sdcDetails = gSon_SDC.fromJson(sdcDetails, SDCDetails.class);

			System.out.println("Data Collector URL: " + _sdcDetails.getHttpUrl());
			System.out.println("ID Separater is :" + _sdcDetails.getIdSeparator());
			System.out.println("Lebels Found" + _sdcDetails.getLabels().toString());

			String dataCollectorURL = _sdcDetails.getHttpUrl();
			String pipelineID = pipeline + _sdcDetails.getIdSeparator()
					+ jobId.replace(":", _sdcDetails.getIdSeparator());

			String dataCollectorInfo = JobMetrics
					.getJobMetrics(dataCollectorURL + "/rest/v1/pipeline/" + pipelineID + "/metrics");
			System.out.println("dataCollectorInfo : " + dataCollectorInfo);

			dcResponse = gSon_SDC.fromJson(dataCollectorInfo, DataCollectorResponse.class);

			if (dataCollectorInfo.contains("RemoteException")) {
				System.out.println("Pipe line foun as Inactive");
				dcResponse = null;

			} else {

				System.out.println(
						"inputRecord : " + dcResponse.getCounters().getPipelineBatchInputRecordsCounter().getCount());
				System.out.println("outPutRecords : "
						+ dcResponse.getCounters().getPipelineBatchOutputRecordsCounter().getCount());
				System.out.println(
						"errorRecords : " + dcResponse.getCounters().getPipelineBatchErrorRecordsCounter().getCount());

			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return dcResponse;
	}

}
