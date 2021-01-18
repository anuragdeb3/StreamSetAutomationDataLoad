package com.hub4techie.dsc.streamsetAPI;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StreamsetJobDetails {

	final static Logger log = Logger.getLogger(StreamsetJobDetails.class);
	/*
	 * 
	 */
	public JobDetails getStreamsetJobDetails(final String streamsetBaseURI, final String streamsetUser,
			final String streamsetPwd, final String job1) throws JSONException {
		
		
		RestAssured.baseURI = streamsetBaseURI;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("userName", streamsetUser);
		requestParams.put("password", streamsetPwd);
		request.contentType("application/json");
		request.header("X-Requested-By", "SCH");
		// log.info(requestParams.toString());
		request.body(requestParams.toString());
		request.relaxedHTTPSValidation();
		Response response = request.post("/security/public-rest/v1/authentication/login");
		int statusCode = response.getStatusCode();
		String authToken = response.header("X-SS-User-Auth-Token");
		log.info("JobDetails : Status Code received is :" + statusCode);
		log.info("JobDetails : Response from service is as below:" + response.asString());
		log.info("JobDetails : Auth Token Received is : " + authToken);
		request.contentType("application/json");
		request.header("X-Requested-By", "SCH");
		request.header("X-SS-REST-CALL", "true");
		request.header("X-SS-User-Auth-Token", authToken);
		request.pathParam("jobId", job1);
		
		Response runnerResponse = request.get("/jobrunner/rest/v1/job/{jobId}");
		log.info("+---------- Response code from job runner is : " + runnerResponse.statusCode());
		log.info("+---------- Response Message from job Runner Service ----------+");
		runnerResponse.print();
		Gson gSon = new Gson();
		JobDetails jobDetails = gSon.fromJson(runnerResponse.asString(), JobDetails.class);
		log.info("Job Name : " + jobDetails.getName());
		log.info("Job Status is : " + jobDetails.getCurrentJobStatus().getStatus());
		log.info("Job Start Time : " + jobDetails.getCurrentJobStatus().getStartTime().toString());
		log.info("Job Finish Time is : " + jobDetails.getCurrentJobStatus().getFinishTime());
		List<String> sdcIds = jobDetails.getCurrentJobStatus().getSdcIds();
		log.info("SDC IDs found are" + sdcIds.toString());
		return jobDetails;
	}

}
