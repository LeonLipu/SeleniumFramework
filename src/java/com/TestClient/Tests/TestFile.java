package TestClient.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.bnkar.locator.GooglePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import bnkar.core.SeleniumDriver;

public class TestFile {

	public static WebDriver driver;
	private ExtentReports extent = ExtentReports.get(TestFile.class);

	@BeforeTest
	public void beforeTest() {
		extent.init("TestNGBasicSample.html", true);
		SeleniumDriver selenium = new SeleniumDriver();
		driver = selenium.initializeDriver();
	}

	@Test
	public void test1() {
		extent.startTest("Test1", "Google page");
		GooglePage googlepage = PageFactory.initElements(driver,
				GooglePage.class);
		extent.log(LogStatus.PASS, "Google page navigated");
		googlepage.entervalue();
	}

	@Test
	public void test2() {
		extent.startTest("Test2", "it is second test");
		extent.log(LogStatus.INFO, "second test case");
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
		extent.endTest();
	}

}
