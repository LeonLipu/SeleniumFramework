package bnkar.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDriver {
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriver driver = new FirefoxDriver();
		// driver.get("http:google.com");
	new SeleniumDriver().getDriver("firefox").get("http://www.google.com/");;

	}

	public WebDriver getDriver(String browserName) {

		switch (browserName.toLowerCase()) {
		case "ie":
			driver=new InternetExplorerDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "chrome":
			driver= new ChromeDriver();
			System.out.println("chrome");
			break;
		default:
			System.out.println("Browser(ie,firefox,chrome) not found ");

		}
		return driver;
	}

}
