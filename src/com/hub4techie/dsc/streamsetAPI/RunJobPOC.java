package com.hub4techie.dsc.streamsetAPI;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.hub4techie.Utils.Library;
import com.hub4techie.test.DiscreteDemandDataLoadAPJ;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RunJobPOC {

	final static Logger log = Logger.getLogger(RunJobPOC.class);

	final static String streamsetBaseURI = Library.getVal("streamset_URL");
	final static String streamsetUser = Library.getVal("streamset_usr").trim();
	final static String streamsetPwd = Library.getVal("streamset_pwd").trim();
	/**
	 * 
	 * @param streamsetBaseURI
	 * @param streamsetUser
	 * @param streamsetPwd
	 * @param jobIDtoRun
	 * @return This method will run the given stream-set job and return the status. If Job is already running, it will return the status of job.
	 * @throws JSONException
	 *  */
	public static String Login(String streamsetBaseURI, String streamsetUser, String streamsetPwd, String jobIDtoRun) throws JSONException {
		
		String JobStatus = null;
		RestAssured.baseURI = streamsetBaseURI;
		//try {
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
		log.info("Status Code received is :" + statusCode);
		log.info("Response from service is as below:" + response.asString());
		log.info("Auth Token Received is : " + authToken);
		
		return authToken;
		}
		
		public static void StartJob() throws JSONException	{
		
		String jobIDtoRun = "b4032ea4-0cb8-4510-93c9-173476ff1f84:test";
		String authToken = Login( streamsetBaseURI,  streamsetUser,  streamsetPwd,  jobIDtoRun);
		RequestSpecification request = RestAssured.given();
		request.contentType("application/json");

		request.header("X-Requested-By", "SCH");
		request.header("X-SS-REST-CALL", "true");
		request.header("X-SS-User-Auth-Token", authToken);
		request.pathParam("jobId", jobIDtoRun);
		 

		Response runnerResponse = request.post("/jobrunner/rest/v1/job/{jobId}/start");
		log.info("+---------- Response code from job runner is : " + runnerResponse.statusCode());
		log.info("+---------- Response Message from job Runner Service ----------+");
		System.exit(0);
		runnerResponse.print();
		Gson gSon = new Gson();
		/*if (runnerResponse.getStatusLine().contains("HTTP/1.1 400 Bad Request")) {
			log.info("Job is already Active");
			JobStatus = "Active";

		} else {

			StartJobResponse jobResponse = gSon.fromJson(runnerResponse.asString(), StartJobResponse.class);
			log.info("+---------- Status of Job is : " + jobResponse.getStatus());
			log.info("+---------- Start Time of Job is : " + jobResponse.getStartTime());
			log.info("+---------- Start job: error message is : " + jobResponse.getErrorMessage());
			JobStatus = jobResponse.getStatus();
		}
		}
		catch(JSONException e) {
			log.error("JSONException exception has been raised at runStreamsetJob method",e);
			
		}
		catch(Exception e) {
			log.error("JSONException exception has been raised at runStreamsetJob method",e);
			
		}*/
		
		
		
		//return JobStatus;
	}
	
	
	
}
