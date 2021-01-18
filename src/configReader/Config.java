package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;



public class Config {	
	
	final static Logger log = Logger.getLogger(Config.class);
	public static Properties prop= new Properties();
	
	/*
	 * @param	filePath	:	filePath where properties file exist	
	 * @return 				:	Properties will be returned containing key values mentioned in file
	 * @getPropertiesFromFilePath : This method will read  the properties file and return the properties loaded after reading the file from given location
	 */
	public static Properties getConfig(String filePath) {
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
	
	
	public static String getVal(String key)
	{
		String value =prop.getProperty(key);
		return value;
	}
	
	

	

}
