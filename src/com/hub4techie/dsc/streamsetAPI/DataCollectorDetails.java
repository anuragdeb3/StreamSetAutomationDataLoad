package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.google.common.base.Objects;
import com.google.gson.Gson;
import com.hub4techie.Utils.Library;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataCollectorDetails {
	public static List<BigInteger> inputRecord = new ArrayList<BigInteger>();
	public static List<BigInteger> outputRecord = new ArrayList<BigInteger>();
	public static List<Integer> errorRecord = new ArrayList<Integer>();
	
	final static Logger log = Logger.getLogger(DataCollectorDetails.class);
	final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
	final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
	final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();
	public static String DataCollectorURL = "";

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
			log.info("Data Collector : Status Code received is :" + statusCode);
			log.info("Data Collector : Response from service is as below:" + response.asString());
			log.info("Data Collector : Auth Token Received is : " + authToken);
			request.contentType("application/json");
			request.header("X-Requested-By", "SCH");
			request.header("X-SS-REST-CALL", "true");
			request.header("X-SS-User-Auth-Token", authToken);

			String sdcDetails = SdcId.getSdcDetails(sdcId);
			Gson gSon_SDC = new Gson();
			SDCDetails _sdcDetails = gSon_SDC.fromJson(sdcDetails, SDCDetails.class);

			log.info("Data Collector URL: " + _sdcDetails.getHttpUrl());
			DataCollectorURL = _sdcDetails.getHttpUrl();

			String dataCollectorURL = _sdcDetails.getHttpUrl();
			
			String pipelineID = pipeline + _sdcDetails.getIdSeparator()
					+ jobId.replace(":", _sdcDetails.getIdSeparator());
			
			String dataCollectorInfo = JobMetrics.getJobMetrics(dataCollectorURL + "/rest/v1/pipeline/" + pipelineID + "/metrics");
			dcResponse = gSon_SDC.fromJson(dataCollectorInfo, DataCollectorResponse.class);
			log.info(dataCollectorInfo);			
			
			if (dataCollectorInfo.contains("RemoteException")) {
				log.info("Pipe line found as Inactive");
				dcResponse = null;

			} else if (dcResponse != null) {
				
				log.info("Data Collector Info is not Null. ");

				
				log.info("inputRecord : " + dcResponse.getCounters().getPipelineBatchInputRecordsCounter().getCount());
				log.info("outPutRecords : "
						+ dcResponse.getCounters().getPipelineBatchOutputRecordsCounter().getCount());
				log.info("errorRecords : " + dcResponse.getCounters().getPipelineBatchErrorRecordsCounter().getCount());
				
				inputRecord.add(dcResponse.getCounters().getPipelineBatchInputRecordsCounter().getCount());
				outputRecord.add(dcResponse.getCounters().getPipelineBatchOutputRecordsCounter().getCount());
				errorRecord.add(dcResponse.getCounters().getPipelineBatchErrorRecordsCounter().getCount());
				
				}
				
		} 
		catch (NullPointerException e) {
			log.error("Check if the Job has already processed all the records");
			log.info("Null Pointer Exception Caused at getDataCollectorDetails method : ", e);
		} catch (Exception ex) {

			ex.printStackTrace();

		}
		return dcResponse;
	}

	
	
	
	static public BigInteger getMaxInputRecord() {
		
				
		BigInteger maxInput = Collections.max(inputRecord);
		return maxInput;
	}
	
	static public BigInteger getMaxOutputRecord() {
		
		
		BigInteger maxOutput = Collections.max(outputRecord);
		return maxOutput;
		
	}
	static public int getMaxErrorRecord() {
				
		int maxError = Collections.max(errorRecord);
		return maxError;
	}
	
	static public void emptyRecordList() {
		inputRecord.clear();
		outputRecord.clear();
		errorRecord.clear();
	}
	
	
	
	
	
	
}
