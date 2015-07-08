package TestClient.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestClient.Pages.Googlebasepage;
import bnkar.core.SeleniumDriver;

public class Google {

	public static WebDriver driver;


	@BeforeTest
	public void beforeTest() {
		
		SeleniumDriver selenium = new SeleniumDriver();
		driver = selenium.initializeDriver();
	}

	@Test
	public void test1() {
		Googlebasepage googlepage = PageFactory.initElements(driver,
				Googlebasepage.class);
		googlepage.entervalue();
		googlepage.doSearch();
	}

	@Test
	public void test2() {

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
