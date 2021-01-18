package com.hub4techie.credHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class FileHelpers {

	private static String testFileName_prefix = "_testCaseInput.properties";
	private static String downloadPath = System.getProperty("user.home")+"/Downloads/";

	public static boolean isFileDownloaded_fromTFS(String fileName) {
		boolean flag = false;
		fileName +=testFileName_prefix;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				return flag=true;
		}

		return flag;
	}

	public static Properties parsePropertiesString(String testCaseID) {
		testCaseID = downloadPath + testCaseID + testFileName_prefix;	
		return getPropertiesFromFilePath(testCaseID);	
	}

	/*
	 * @param	filePath	:	filePath where properties file exist	
	 * @return 				:	Properties will be returned containing key values mentioned in file
	 * @getPropertiesFromFilePath : This method will read  the properties file and return the properties loaded after reading the file from given location
	 */
	public static Properties getPropertiesFromFilePath(String filePath) {
		final Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			p.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	public static String getTestCaseID(String testName) throws Throwable{
		Class.forName("org.relique.jdbc.csv.CsvDriver");
		Connection conn = DriverManager.getConnection("jdbc:relique:csv:" + "Configuration" );
		
		String testID= null;

		try {

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT automatedTestName,automatedTestStorage,id FROM testAssociation where automatedTestName ="+"'"+testName+"'";
			ResultSet results = stmt.executeQuery(query);

			while (results.next())
			{
				testID = results.getString("id") ;

			}			
			conn.close();
			return testID ;

		} catch (Exception e) {
			e.printStackTrace();
			conn.close();
			return testID ;
		}

	}

}
