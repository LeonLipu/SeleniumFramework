package TestClient.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.bnkar.locator.GooglePage;

import bnkar.core.SeleniumDriver;



public class TestFile {

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		SeleniumDriver selenium = new SeleniumDriver();
		driver=selenium.initializeDriver();
	}
	
	@Test
	public void f() {		
	GooglePage googlepage=PageFactory.initElements(driver, GooglePage.class);
		
	googlepage.entervalue();
	}



	@AfterTest
	public void afterTest() {
		
		driver.quit();
	}

}
