package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.net.ConnectException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.base.Objects;
import com.hub4techie.Utils.Library;
import com.sun.istack.Nullable;

public class WaitForJobToCompleteSource {

	final static Logger log = Logger.getLogger(WaitForJobToCompleteSource.class);

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
	public static void waitForJobToComplete(String jobID, int waitTime_InSec) {

		final String streamsetBaseURI = Library.getVal("streamset_URL").toString().trim();
		final String streamsetUser = Library.getVal("streamset_usr").toString().trim();
		final String streamsetPwd = Library.getVal("streamset_pwd").toString().trim();
		BigInteger actualProcessedCount;

		/*
		 * Writer for /landingzone/EBIDSC/DataFiles/_tmp_DSC_EBI sending no-more-data
		 * event. records 1 errors 0 files 1
		 * 
		 */

		JobDetails jobDetails = null;
		DataCollectorResponse collectedData = null;

		
		StreamsetJobDetails getJobStatus = new StreamsetJobDetails();
		DataCollectorDetails dataColletor = new DataCollectorDetails();
		try {

			jobDetails = getJobStatus.getStreamsetJobDetails(streamsetBaseURI, streamsetUser, streamsetPwd, jobID);
			// get Actual Data processed count
			collectedData = dataColletor.getDataCollectorDetails(jobDetails.getCurrentJobStatus().getSdcIds().get(0),
					jobDetails.getPipelineName(), jobDetails.getId());

			//log.info(collectedData.getGauges().getRunner0Gauge().getValue().getOffsetKey().toString());
			if(!Objects.equal(collectedData.getGauges().getRunner0Gauge().getValue().getOffsetKey(),null) ) {
				
				log.info("Job has picked up data from : "+collectedData.getGauges().getRunner0Gauge().getValue().getOffsetKey().toString());
			}
			else {
				log.info("Job Has not picked up the data");
				//System.exit(0);
			}
		
			
			
			//Will run till JOB Status is Active		
			while (jobDetails.getCurrentJobStatus().getStatus().equals("ACTIVE")) {
				
				// If CollectedData available, continue with wait
				if (collectedData != null) {
					actualProcessedCount = collectedData.getCounters().getPipelineBatchInputRecordsCounter().getCount();
						log.info("Actual Processed Count from DataCollector till now :"+actualProcessedCount);
						log.info("Starting to Wait for job--------------------------");
						
						
						/*
						 * Commented as we can't get the expected Count always
						 * 
						 * if (expectedRecordsCount.equals(null)) { waitForTime(waitTime_InMinutes); }
						 * else if (expectedRecordsCount.equals(actualProcessedCount)) { break; }
						 */
						
						/**
						 * Commented below line as sometimes we are not getting any response
						 */
						
						//if(jobDetails.getCurrentJobStatus().getErrorMessage().toString().length() != 0) {
							log.error("Error : " + jobDetails.getCurrentJobStatus().getErrorMessage());
							
							//}
						
						
						Library.waitForGivenTimeInSeconds(waitTime_InSec);
						
					}

				
			jobDetails = getJobStatus.getStreamsetJobDetails(streamsetBaseURI, streamsetUser, streamsetPwd, jobID);
			// get Actual Data processed count
			collectedData = dataColletor.getDataCollectorDetails(
					jobDetails.getCurrentJobStatus().getSdcIds().get(0), jobDetails.getPipelineName(),
					jobDetails.getId());
			

			}//End of while 
			
			
			if (jobDetails.getCurrentJobStatus().getStatus().equals("INACTIVE")
					&& Objects.equal(jobDetails.getCurrentJobStatus().getErrorMessage(),null))				//When Job status gets INACTIVE we can't fetch error records
					{
				
				log.info("Job Successfully completed. Error message if any: " + jobDetails.getCurrentJobStatus().getStatus());

			} 
			else if (jobDetails.getCurrentJobStatus().getStatus().equals("DEACTIVATING")
					&& Objects.equal(jobDetails.getCurrentJobStatus().getErrorMessage(),null))
			{
				
				log.info("Job is Getting Deactivated.");

			}
			else
				log.info("Job FAILED. Error message if any " + jobDetails.getCurrentJobStatus().getErrorMessage());

				
			

		} catch (JSONException e) {
			log.error("JSON Exception Caused at waitForJobToComplete method : ",e);

			//e.printStackTrace();
		}
		 catch (NullPointerException e) {
			 
				log.error("NullPointer Exception Caused at waitForJobToComplete method : ",e);
				//e.printStackTrace();
			}
		
		catch(Exception e) {
			log.error("Generic Exception Caused at waitForJobToComplete method : ",e);
		}

	}

}
