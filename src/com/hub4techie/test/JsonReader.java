package com.hub4techie.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonReader {

	public static void main(String[] args) {
		

		//Object obj = parser.parse(new FileReader("C:\\Users\\Anurag_Deb\\eclipse-workspace\\AutoStreamSet\\Configuration\\sample.json"));
	
		
		try {

			String content = FileUtils.readFileToString(new File("C:\\Users\\Anurag_Deb\\eclipse-workspace\\AutoStreamSet\\Configuration\\sample.json"), StandardCharsets.UTF_8);

	        
			
	            JSONObject jsonObject =new JSONObject(content);
	            JSONObject jsonChildObject = (JSONObject)jsonObject.get("gauges");
	            
	            jsonChildObject = (JSONObject)jsonChildObject.get("runner.0.gauge");
	            
	            jsonChildObject = (JSONObject)jsonChildObject.get("value");
	            
	            String offetKey = jsonChildObject.get("offsetKey").toString();
	            
	            if (offetKey.isEmpty()== false)
	            	System.out.println("Job has picked up File from : "+offetKey);
	            
	            
	            
	            /*
	            Iterator iterator  = jsonChildObject.keys();
	            
	            
	            
	            String key = null;
	            while(iterator.hasNext()){
	                key = (String)iterator.next();
	                if (key.equals("runner.0.gauge"))
	                //System.out.println(key);
	                System.out.println("inval value: "+((JSONObject)jsonChildObject.get(key)));
	            }*/
	        }
	        catch (JSONException | IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
		
	}
}
