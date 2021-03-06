package bnkar.core;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import TestClient.Tests.TestFile;
import bnkar.services.IO;

public class SeleniumDriver {
	public WebDriver driver;
	private ExtentReports extent;

	public static void main(String[] args) {

	}

	/**
	 * Open browser with specific name 
	 * @param browserName
	 * @return
	 */
	private WebDriver getDriver(String browserName) {

		switch (browserName.toLowerCase()) {
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("chrome");
			break;
		default:
			System.out.println("Browser(ie,firefox,chrome) not found ");

		}
		EventFiringWebDriver Edriver = new EventFiringWebDriver(driver);
		CustomWebdriverListener cwl = new CustomWebdriverListener();

		Edriver.register(cwl);
		return Edriver;
	}
	
	/**
	 * This method will responsible  to initialize driver and navigate to url 
	 * which written with configuration file. 
	 * @return
	 */

	public WebDriver initializeDriver() {
		IO io = new IO();
		PropertyConfigurator.configure("log4j.properties");
		String url = (String) io.loadPropertyFile("config.properties").get(
				"url");
		WebDriver driver = new SeleniumDriver().getDriver((String) io
				.loadPropertyFile("config.properties").get("browser"));
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
