package com.hub4techie.dsc.streamsetAPI;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.hub4techie.Utils.Library;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JobCurrentStatus {

	final static Logger log = Logger.getLogger(JobCurrentStatus.class);
	final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
	final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
	final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();

	
	
	public CurrentStatus getCurrentStatus(final String job1) throws JSONException {
		CurrentStatus curStat=null;
		
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
		
		Response runnerResponse = request.get("/jobrunner/rest/v1/job/{jobId}/currentStatus");
		log.info("+---------- Response code from job runner is : " + runnerResponse.statusCode());
		log.info("+---------- Response Message from job Runner Service ----------+");
		runnerResponse.print();
		Gson gSon = new Gson();
		curStat= gSon.fromJson(runnerResponse.asString(), CurrentStatus.class);
		
		log.info("Job Name : " + curStat.getStatus());
	
		return curStat;
	}

}

