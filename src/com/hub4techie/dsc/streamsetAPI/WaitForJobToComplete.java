package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.json.JSONException;

import com.sun.istack.Nullable;

import configReader.Config;


public class WaitForJobToComplete {

	
	
	final static Logger log = Logger.getLogger(WaitForJobToComplete.class);
		
	/**
	 * 
	 * @param jobID
	 * @param waitTime_InMinutes
	 * @param maxAttempt
	 * @param expectedRecordsCount
	 * @description This Job will wait for a given job to complete till expected
	 *              number of records are processed. If any failure happens during
	 *              job run, it will end the wait with error log.
	 */
	public static void waitForJobToComplete(String jobID, int waitTime_InMinutes, int maxAttempt,
			@Nullable BigInteger expectedRecordsCount) {
		
		final String streamsetBaseURI = Config.getVal("streamset_URL").toString().trim();
		final String streamsetUser = Config.getVal("streamset_usr").toString().trim();
		final String streamsetPwd = Config.getVal("streamset_pwd").toString().trim();
		BigInteger actualProcessedCount;

		/*
		 * Writer for /landingzone/EBIDSC/DataFiles/_tmp_DSC_EBI sending no-more-data
		 * event. records 1 errors 0 files 1
		 * 
		 */
		
		StreamsetJobDetails getJobStatus = new StreamsetJobDetails();
		try {

			DataCollectorDetails dataColletor = new DataCollectorDetails();
			JobDetails jobDetails = null;
			DataCollectorResponse collectedData = null;

			for (int i = 0; i < maxAttempt; i++) {
						jobDetails = getJobStatus.getStreamsetJobDetails(streamsetBaseURI, streamsetUser,
						streamsetPwd, jobID);
				// get Actual Data processed count
				collectedData = dataColletor.getDataCollectorDetails(
						jobDetails.getCurrentJobStatus().getSdcIds().get(0), jobDetails.getPipelineName(),
						jobDetails.getId());

				// If CollectedData available, continue with wait
				if (collectedData != null) {

					actualProcessedCount = collectedData.getCounters().getPipelineBatchInputRecordsCounter().getCount();

					if ((jobDetails.getCurrentJobStatus().getStatus().equals("ACTIVE"))
							|| (jobDetails.getCurrentJobStatus().getStatus().equals("ACTIVATING"))
//									&& jobDetails.getCurrentJobStatus().getErrorMessage().equals(null)
									) {
						System.out.println("Starting to Wait for job--------------------------");

						waitForTime(waitTime_InMinutes);
						i++;
					} else if (jobDetails.getCurrentJobStatus().getStatus().equals("INACTIVE")
							&& jobDetails.getCurrentJobStatus().getErrorMessage().equals(null)) {
						System.out
								.println("Job Completed successfully :" + jobDetails.getCurrentJobStatus().getStatus());
						break;
					} else if (jobDetails.getCurrentJobStatus().getStatus().equals("INACTIVE")
							&& jobDetails.getCurrentJobStatus().getErrorMessage().toString().length() != 0) {
						System.out.println(
								"Job Failed with Error : " + jobDetails.getCurrentJobStatus().getErrorMessage());
						break;
					}

				} // else come out of wait
				else {
					break;
				}

			}

			System.out.println("Completed the waiting for job Completion.");

		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}

	private static void waitForTime(int waitTime) {
		System.out.println("Starting to wait :" + new Date());
		try {
			TimeUnit.SECONDS.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed the wait :" + new Date());
	}

}
