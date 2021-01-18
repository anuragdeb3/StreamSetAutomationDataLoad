package com.hub4techie.dsc.streamsetAPI;

import org.json.JSONObject;

import com.hub4techie.Utils.Library;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JobMetrics {

	public static String getJobMetrics (String collectorURL) {

		final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
		final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
		final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();
		//String authToken = "78b66d36-157b-4224-8e32-455aedc6a0fb|-1571842564502";

		String detailsFromDataCollector = null;

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

			Response collectorResponse= request.get(collectorURL);

			detailsFromDataCollector =  collectorResponse.asString();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return detailsFromDataCollector ;

	}
}
