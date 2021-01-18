package com.hub4techie.tfs2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DownloadWorkItemAttachment {

	private void setTFSBaseURI() {
		String baseURL = "http://tfs2.company.com:8080/tfs/eDell/_apis/wit";
		RestAssured.baseURI = baseURL;
	}

	private RequestSpecification authenticateTFS() {
		RequestSpecification request = RestAssured.given();
		request.queryParam("$expand", "All");
		request.auth().basic("your_username", "token");
		return request;
	}

	private WorkItem getWorkItemDetails(String ID) {
		setTFSBaseURI();
		RequestSpecification request = authenticateTFS();
		request.pathParam("id", ID);
		Response response = request.get("/workitems/{id}");
		int statusCode = response.getStatusCode();
		String responseBody = response.asString();
		System.out.println("Response status code from TFS is :" + statusCode);
		// response.print();
		Gson gSon = new Gson();
		WorkItem itemDetails = gSon.fromJson(responseBody.toString(), WorkItem.class);
		return itemDetails;
	}

	/**
	 * 
	 * @param workItemID
	 * @return This Method will return test inputs from attached test input file in work item.
	 * @throws IOException
	 */
	public String getTestInputs(String workItemID) throws IOException {
		String DownloadURL = getDownloadURL(workItemID);
		setTFSBaseURI();
		RequestSpecification request = authenticateTFS();
		Response downloadResponse = request.get(DownloadURL);
		System.out.println("+---------- Response Status code from TFS for Input Attachment reading is : "
				+ downloadResponse.getStatusCode());
		System.out.println("+---------- Found Test inputs are : ");
		downloadResponse.print();
		System.out.println("+---------- Completed Test Inputs Reading ----------+");
		return downloadResponse.asString();
	}

	private String getDownloadURL(String workItemID) {
		WorkItem itemDetails = getWorkItemDetails(workItemID);
		List<Relation> relations = itemDetails.getRelations();
		String fileToDownload = null;
		String DownloadURL = null;
		for (Iterator<Relation> iterator = relations.iterator(); iterator.hasNext();) {
			Relation relation = (Relation) iterator.next();
			if (relation.getRel().toString().equals("AttachedFile")) {
				fileToDownload = relation.getAttributes().getName();
				if (fileToDownload != null && fileToDownload.contains(workItemID)) {
					DownloadURL = relation.getUrl();
					// System.out.println(relation.getAttributes().getName());
					System.out.println("fileToDownload is : " + fileToDownload);
					// System.out.println("Download URL is : " + DownloadURL);
					break ;
				} // closing if
				else {
					DownloadURL = null;
				}
			} // closing if

		} // closing the for loop
		return DownloadURL;
	}

	/**
	 * 
	 * @param workItemID
	 * @return This method will return the test steps as list of Strings from TFS.
	 */
	public List<String> getTestSteps(String workItemID) {
		System.out.println("Started getTestSteps");
		WorkItem itemDetails = getWorkItemDetails(workItemID);
		String stepsHtml = itemDetails.getFields().getMicrosoftVSTSTCMSteps();
		
		System.out.println("stepsHtml");
		Document doc = Jsoup.parse(stepsHtml);
		List<Element> steps = doc.select("parameterizedstring");
		List<String> stepActions = new ArrayList<String>();

		System.out.println("+----------Test Steps found are ----------+");
		int stepNumber = 1;
		for (int i = 0; i < steps.size(); i++) {
			Element element = steps.get(i);
			System.out.println("Step Number " + stepNumber + " :" + element.text().replaceAll("<DIV><P>", "")
					.replaceAll("</P></DIV>", "").replaceAll("<BR/>", "").replaceAll("&nbsp;", ""));
			stepActions.add(element.text().replaceAll("<DIV><P>", "").replaceAll("</P></DIV>", "")
					.replaceAll("<BR/>", "").replaceAll("&nbsp;", ""));
			i += 1;
			stepNumber += 1;
		} // Closing the for loop
		System.out.println("+----------All Test Steps Found ----------+");

		return stepActions;
	}
}
