package com.hub4techie.test;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hub4techie.Utils.Library;

public class DataLoadPRODMST {
	
	final static Logger log = Logger.getLogger(DataLoadPRODMST.class);

	@BeforeTest
	public void beforeTest() throws Throwable {
	
	}

	@BeforeMethod(description = "Executes Before Each Iteration")
	public void beforeMethod() throws Exception {
				
		Library.LoadConfig("Config.properties");
	}

	
	@Test()
	public void UserDefinedTestCase() throws Throwable {

		try {		
			String StreamSetJob = "";
			//Get the files present and data count from files
				StreamSetWorkFlow job = new StreamSetWorkFlow();
				StreamSetJob =Library.getVal("PPCM_PROD_MSTJOB");
				System.out.println(StreamSetJob);
				//RunJobPOC run = new RunJobPOC();
				//run.StartJob();
				job.StreamSetJob(StreamSetJob,3,200);

		}catch(Exception e) {
			log.error("Generic Exception raised at testCase Level :",e);
		}
			
			

		} 
		
		
	

	@AfterMethod(description = "Executes After Each Iteration")
	public void afterMethod(ITestResult res) throws Exception {

	}

	@AfterTest
	public void tearDown() throws Throwable {
	
	}

}
