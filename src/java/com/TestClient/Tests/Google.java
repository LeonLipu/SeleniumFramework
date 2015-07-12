package TestClient.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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

	@Test(dataProvider="searchelement")
	public void test1(int serial,String searchelement) {
		Googlebasepage googlepage = PageFactory.initElements(driver,
				Googlebasepage.class);
		googlepage.entervalue(searchelement);
		googlepage.doSearch();
	}

	@Test(dataProvider="searchelement")
	public void test2(int serial,String searchelement) {
		
			Googlebasepage googlepage = PageFactory.initElements(driver,
					Googlebasepage.class);
			googlepage.entervalue(searchelement);
			googlepage.doSearch();

	}

	@DataProvider(name = "searchelement")
	public static Object[][] getSearchElement() {
		return new Object[][] { { 1, "this" }, { 2, " is " }, { 3, " data " },
				{ 4, " provider" } };
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
