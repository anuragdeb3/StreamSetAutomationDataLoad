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

public class DiscreteDemandDataLoadAPJ {

	final static Logger log = Logger.getLogger(DiscreteDemandDataLoadAPJ.class);

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
			String StreamSetJob = "";
			
			String FileName = "DataLake_1_20200430220605.zip";
			int SourceCount = 0;
			
			/************* verify if zip file is present in Server Location ***/
			
				List<String> LinuxOutput = Library.getListRunCmdOnLinux(Library.getVal("ListFilesAPJ"),
					Library.getVal("host"), Library.getVal("UserName"), Library.getVal("streamset_pwd"));
			
			if (LinuxOutput.size() < 0 || LinuxOutput.isEmpty()) {

				log.error("There is no file of zip pattern at : " + Library.getVal("ListFilesAPJ"));
				System.exit(0);

			} else {

				log.info("No of Files :" + LinuxOutput.size());
				log.info(" File/s present in server location : " + LinuxOutput);
				
				
				/********************** Check Source Count *******************/
				
			log.info(Library.getVal("PatternAPJZIP"));
				//Check count from Linux. If there are more than one file it will give you the total
				List<String> SourceCountLinux = Library.getListRunCmdOnLinux(Library.getVal("PatternAPJZIP"), Library.getVal("host"),
						Library.getVal("UserName"), Library.getVal("streamset_pwd"));
				//System.out.println(SourceCountLinux);
				SourceCount=Integer.parseInt(SourceCountLinux.get(0));
				
				
				
				//Check count from Windows
				//SourceCount =UnZip.unZipIt(Library.getVal("INPUT_ZIP_FILE")+FileName,Library.getVal("OUTPUT_FOLDER"));				
				
				log.info("Source Count :"+ SourceCount);
				
				
				/****************************************Start running Jobs*****************/
				StreamSetWorkFlow job = new StreamSetWorkFlow();

				StreamSetJob = Library.getVal("APJStreamSetJob1");
				job.StreamSetJob(StreamSetJob, 3, 2); // WaitTimeInSeconds , Flag for choosing if it is 1st job or other

				/*********************Valid Count *************************************/
				
				BigInteger ActualOutputRecord = job.getrecords().get(1);	// Get Output  Record
				log.info(ActualOutputRecord);
				
				
				//Just Check if Output List is set to 0 again
				log.info(DataCollectorDetails.getMaxOutputRecord());

				if (BigInteger.valueOf(SourceCount).equals(ActualOutputRecord) && SourceCount > 0) {
					log.info("Source Count is equal to count that came from DataCollectors i.e." + SourceCount + " = "
							+ ActualOutputRecord);
				} else {

					log.error("Source Count is not equal to count that came from DataCollectors i.e." + SourceCount
							+ " != " + ActualOutputRecord);
					System.exit(0);
				}
				
				/*
				

					log.info("STARTING 2nd JOB");

					Library.waitForGivenTimeInSeconds(10);

					StreamSetJob =Library.getVal("APJStreamSetJob2");
					job.StreamSetJob(StreamSetJob,3,2);
					
					*//***************************Validate if TD File is Created ***********//*
					
					List<String> TDFileExistList = Library.getListRunCmdOnLinux(Library.getVal("TDDataFileAPJ"), Library.getVal("host"),
							Library.getVal("UserName"), Library.getVal("streamset_pwd"));
					
					if(TDFileExistList.size()>0)
					{
						log.info("There is no file of zip pattern at : " + Library.getVal("TDDataFileAPJ"));
					}
					else {
						log.error("There is no file of zip pattern at : " + Library.getVal("TDDataFileAPJ"));
						//System.exit(0);

					}
					
					Library.waitForGivenTimeInSeconds(10);
					//System.exit(0);
					
					StreamSetJob =Library.getVal("APJStreamSetJob3");
					job.StreamSetJob(StreamSetJob,3,2);
					
					*//***************************Validate if GP File is Created ***********//*
					
					List<String> GPFileExistList = Library.getListRunCmdOnLinux(Library.getVal("GPDataFileAPJ"), Library.getVal("host"),
							Library.getVal("user"), Library.getVal("password"));
					if(GPFileExistList.size()>0)
					{
						log.info("There is no file of zip pattern at : " + Library.getVal("GPDataFileAPJ"));
					}
					else {
						log.error("There is no file of zip pattern at : " + Library.getVal("GPDataFileAPJ"));
						System.exit(0);

					}
					
					
					
					Library.waitForGivenTimeInSeconds(10);
					
					StreamSetJob =Library.getVal("APJStreamSetJob4");
					job.StreamSetJob(StreamSetJob,3,2);
					
					Library.waitForGivenTimeInSeconds(10);
					
					StreamSetJob =Library.getVal("APJStreamSetJob5");
					job.StreamSetJob(StreamSetJob,3,2);

					
					
					*//*******Validation from Database************//*
					
					
					
					Connection gpConn = null;
					log.info("Connecting to RDL Header DB");
					gpConn = DBUtils.GPconnect(Library.getVal("LZDBHost"), Library.getVal("LZDBName"), Library.getVal("LZUser"),
							Library.getVal("LZPass"));
					int GPINCAPJCount = DBUtils.countQuery(gpConn, Library.getVal("GPAPJINCCount"));
					if (GPINCAPJCount == SourceCount)
					{
						log.info("Actual Count of Source and INC Table matched GPINCAPJCount :"
					+GPINCAPJCount+ " = "+SourceCount+" SourceCount");
					}
					else {
						log.error("Actual Count of Source and INC Table doesn't match GPINCAPJCount :"
								+GPINCAPJCount+ " != "+SourceCount+" SourceCount");
					}
					
					gpConn = DBUtils.GPconnect(Library.getVal("LZDBHost"), Library.getVal("LZDBName"), Library.getVal("LZUser"),
							Library.getVal("LZPass"));
					int ActualGPAMERCount = DBUtils.countQuery(gpConn, Library.getVal("GPAMERCount"));
					
					
					
					if (BigInteger.valueOf(ActualGPAMERCount) == DataCollectorDetails.getMaxInputRecord())
					{
						log.info("Actual Count of GP and output record from DataCollector matched ActualGPAMERCount :"
					+GPINCAPJCount+ " = "+DataCollectorDetails.getMaxOutputRecord()+" Output Record");
					}
					else {
						log.error("Actual Count of GP and output record from DataCollector matched ActualGPAMERCount :"
								+GPINCAPJCount+ " = "+DataCollectorDetails.getMaxOutputRecord()+" Output Record");
						System.exit(0);
					}
					
					
					*/
					
					
				
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
