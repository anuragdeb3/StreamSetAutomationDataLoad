package com.hub4techie.dsc.streamsetAPI;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hub4techie.Utils.Library;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class History {

	final static Logger log = Logger.getLogger(History.class);
	
	public static HistoryDetails getHistoryDetails (String jobId) {

		final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
		final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
		final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();
		//String authToken = "78b66d36-157b-4224-8e32-455aedc6a0fb|-1571842564502";
		HistoryDetails jobHistDetails = null;
		PipelineOffsets offsetDetails = null;
		
		
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
			request.pathParam("jobId", jobId);

			Gson gSon = new Gson();
			log.info(Library.getVal("streamset_URL") + "/jobrunner/rest/v1/job/" + jobId + "/history");
			Response histResponse= request.get("/jobrunner/rest/v1/job/{jobId}/history");
			
					
			jobHistDetails = gSon.fromJson(histResponse.asString(), HistoryDetails.class);
			
			//offsetDetails = gSon.fromJson(histResponse.asString(), PipelineOffsets.class);
			
			log.info("User Name : " + jobHistDetails.getUser());
			log.info("Job Current Status : " + jobHistDetails.getStatus());
			log.info("User Name : " + jobHistDetails.getUser());
			log.info("User Name : " + jobHistDetails.getUser());
			log.info("Start Time :"+jobHistDetails.getStartTime());
			log.info("End Time :"+jobHistDetails.getFinishTime());	
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jobHistDetails ;

	}
}
