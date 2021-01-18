package com.hub4techie.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.hub4techie.Utils.Library;

public class UnZip {

	
		static String FileName ="DataLake_1_20200505060656.zip";

		  List<String> fileList;
		    

		    public static void main( String[] args )
		    {
		    	Library.LoadConfig("DSCE2ESDK.properties");
		    	System.out.println(Library.getVal("INPUT_ZIP_FILE")+FileName);
		    	System.out.println(Library.getVal("OUTPUT_FOLDER"));
		    	UnZip.unZipIt(Library.getVal("INPUT_ZIP_FILE")+FileName,Library.getVal("OUTPUT_FOLDER"));
		    }

		    /**
		     * Unzip it
		     * @param zipFile input zip file
		     * @param output zip file output folder
		     */
		    public static int unZipIt(String zipFile, String outputFolder){

		    	int TotalCount = 0;
		     byte[] buffer = new byte[1024];

		     try{

		    	//create output directory is not exists
		    	File folder = new File(outputFolder);
		    	if(!folder.exists()){
		    		folder.mkdir();
		    	}

		    	//get the zip file content
		    	ZipInputStream zis =
		    		new ZipInputStream(new FileInputStream(zipFile));
		    	//get the zipped file list entry
		    	ZipEntry ze = zis.getNextEntry();
		    
		    	File newFile = null;
		    	while(ze!=null){

		    	   String fileName = ze.getName();
		           newFile = new File(outputFolder + File.separator + fileName);

		           System.out.println("file unzip : "+ newFile.getAbsoluteFile());
		           
		           
		       	
			    	if (ze.isDirectory()) {

			    		ze = zis.getNextEntry();

			    		continue;

			    		}

		            //create all non exists folders
		            //else you will hit FileNotFoundException for compressed folder
		            new File(newFile.getParent()).mkdirs();

		            FileOutputStream fos = new FileOutputStream(newFile);

		            int len;
		            while ((len = zis.read(buffer)) > 0) {
		       		fos.write(buffer, 0, len);
		            }

		            fos.close();
		            ze = zis.getNextEntry();
		    	}

		        zis.closeEntry();
		    	zis.close();

		    	System.out.println("Done");
		    	
		    	 FileReader fr = new FileReader(newFile);
	    		    LineNumberReader lnr = new LineNumberReader(fr);

	    		    TotalCount = 0;

	    	            while (lnr.readLine() != null){
	    	            	TotalCount++;
	    	            }

	    	            

	    	            lnr.close();
		    	

		    }catch(IOException ex){
		       ex.printStackTrace();
		    }
		     return TotalCount;
	}
}
