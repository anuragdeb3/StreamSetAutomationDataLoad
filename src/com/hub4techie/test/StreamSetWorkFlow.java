package com.hub4techie.test;

import static org.testng.Assert.fail;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.hub4techie.Utils.Library;
import com.hub4techie.dsc.streamsetAPI.DataCollectorDetails;
import com.hub4techie.dsc.streamsetAPI.RunStreamSetJob;
import com.hub4techie.dsc.streamsetAPI.WaitForJobToComplete2;
import com.hub4techie.dsc.streamsetAPI.WaitForJobToCompleteSource;

public class StreamSetWorkFlow {

	final static Logger log = Logger.getLogger(DiscreteDemandDataLoadAPJ.class);
	final String streamsetBaseURI = Library.getVal("streamset_URL");
	final String streamsetUser = Library.getVal("streamset_usr").trim();
	final String streamsetPwd = Library.getVal("streamset_pwd").trim();
	// int waitFrequency_InSec = 5, maxAttempt = 7;

	public String StreamSetJob(String JobID, int waitFrequency_InSec, int flag) {
		
		RunStreamSetJob runStreamsetJob = new RunStreamSetJob();
		String JobStatus ="";
		
		try {
							
			
			JobStatus= runStreamsetJob.runStreamsetJob(streamsetBaseURI, streamsetUser, streamsetPwd,JobID);
		
			log.info("job2_Status : " + JobStatus);		
			if(flag == 1) 
				WaitForJobToCompleteSource.waitForJobToComplete(JobID, waitFrequency_InSec);
						
			else
				WaitForJobToComplete2.waitForJobToComplete(JobID, waitFrequency_InSec);
			
			

		}
		catch(NullPointerException e) {
			log.error("Check if the Job has stopped/failed/Inactive");
			String jobStatus = runStreamsetJob.runStreamsetJob(streamsetBaseURI, streamsetUser, streamsetPwd,
					JobID);
			log.error("Status of the job is: "+jobStatus);
			log.error("Null Pointer Exception Caused at getDataCollectorDetails method : ",e);
		}
		
		catch (Exception e) {
			log.error("Generic Exception Caused at getDataCollectorDetails method : ",e);
			e.printStackTrace();
			fail();
		}

	return JobStatus;
}

	
	
	public List<BigInteger> getrecords() {
		List<BigInteger> recordlist= new ArrayList<BigInteger>();
		recordlist.add(DataCollectorDetails.getMaxInputRecord());
		recordlist.add(DataCollectorDetails.getMaxOutputRecord());
		recordlist.add(BigInteger.valueOf(DataCollectorDetails.getMaxErrorRecord()));
		DataCollectorDetails.emptyRecordList();
	return recordlist;
	
	}
	
	public List<Integer> setrecords() {
		List<Integer> recordlist= new ArrayList<Integer>();
		recordlist.add(0);
		recordlist.add(3);
		recordlist.add(2);
		//DataCollectorDetails.emptyRecordList();
	return recordlist;
	
	}
	
	
	
}
