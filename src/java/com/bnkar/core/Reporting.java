package bnkar.core;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;


public class Reporting  {
	public static  ExtentReports extent ;
	

	
	/**
	 * This method taking screenshot with unique number appending to it .
	 * @param driver
	 * @return
	 */
	
	public static String createScreenshot(WebDriver driver) {
	    
	    UUID uuid = UUID.randomUUID();
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	       org.apache.commons.io.FileUtils.copyFile(scrFile, new File("/img" + uuid + ".png"));
	       System.out.println("/img/screen" + uuid + ".png");
	    } catch (IOException e) {
	        System.out.println("Error while generating screenshot:\n" + e.toString());
	    }
	    return "/img" + uuid + ".png";
	}

}


