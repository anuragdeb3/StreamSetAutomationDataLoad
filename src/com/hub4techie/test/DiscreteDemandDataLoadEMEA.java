package com.hub4techie.test;

import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hub4techie.Utils.Library;
import com.hub4techie.dsc.streamsetAPI.DataCollectorDetails;

public class DiscreteDemandDataLoadEMEA{

	final static Logger log = Logger.getLogger(DiscreteDemandDataLoadEMEA.class);

	@BeforeTest
	public void beforeTest() throws Throwable {
		
	}

	@BeforeMethod(description = "Executes Before Each Iteration")
	public void beforeMethod() throws Exception {
	
		Library.LoadConfig("DSCE2ESDK.properties");
	}

	

	@Test()
	public void UserDefinedTestCase() throws Throwable {

		try {
			String StreamSetJob="";
			
			//Until we get linux credentials, copy the file to a directory and get the source count
			
			String FileName ="DataLake_1_20200505060656.zip";
			int SourceCount = UnZip.unZipIt(Library.getVal("INPUT_ZIP_FILE")+FileName,Library.getVal("OUTPUT_FOLDER"));
			
			
			// verify if file is present in Server Location
			List<String> LinuxOutput = Library.getListRunCmdOnLinux(Library.getVal("ListFilesEMEA"), Library.getVal("host"),
					Library.getVal("user"), Library.getVal("password"));
			if (LinuxOutput.size() < 0 || LinuxOutput.isEmpty()) {
				/*
				 * Will Abort
				 */
				log.info("There is no file of zip pattern at : "+Library.getVal("ListFilesEMEA"));
				System.exit(0);
			}
			else {
				
			
			System.out.println("No of Files :" + LinuxOutput.size() );
			System.out.println(" File/s present in server location : " + LinuxOutput);

			
			StreamSetWorkFlow job = new StreamSetWorkFlow();
			
			 /*StreamSetJob =Library.getVal("EMEAStreamSetJob1");
			 job.StreamSetJob(StreamSetJob,3,2);
			 
			Library.waitForGivenTimeInSeconds(10);	*/
			
			BigInteger ActualInputRecord = DataCollectorDetails.getMaxInputRecord();
			
			if (BigInteger.valueOf(SourceCount).compareTo(ActualInputRecord) == 0) {
				
				log.info("Source Count is equal to count that came from DataCollectors i.e." +SourceCount + " = "+ActualInputRecord);
				
			}
			else {
				
				log.info("Source Count is not equal to count that came from DataCollectors i.e." +SourceCount + " != "+ActualInputRecord);
				System.exit(0);
			}
			
			log.info("STARTING 2nd JOB");
			
			 StreamSetJob =Library.getVal("EMEAStreamSetJob2");
			 job.StreamSetJob(StreamSetJob,3,2);
			 
			 Library.waitForGivenTimeInSeconds(10);
			 
			 StreamSetJob =Library.getVal("EMEAStreamSetJob3");
			 job.StreamSetJob(StreamSetJob,3,2);
			 
			}

		} catch (Exception e) {
			log.error("Generic Exception raised at testCase Level :", e);
		}

	}

	@AfterMethod(description = "Executes After Each Iteration")
	public void afterMethod(ITestResult res) throws Exception {
		
	}

	@AfterTest
	public void tearDown() throws Throwable {
	
	}

}
