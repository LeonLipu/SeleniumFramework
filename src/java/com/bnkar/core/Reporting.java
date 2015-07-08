package bnkar.core;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestClient.Tests.TestFile;

import com.relevantcodes.extentreports.ExtentReports;


public class Reporting  {
	public static  ExtentReports extent ;
	
	
	public static String createScreenshot(WebDriver driver) {
	    
	    UUID uuid = UUID.randomUUID();
	   
	 
	    // generate screenshot as a file object
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	        // copy file object to designated location
	       org.apache.commons.io.FileUtils.copyFile(scrFile, new File("/img" + uuid + ".png"));
	       System.out.println("/img/screen" + uuid + ".png");
	    } catch (IOException e) {
	        System.out.println("Error while generating screenshot:\n" + e.toString());
	    }
	    return "/img" + uuid + ".png";
	}

}


