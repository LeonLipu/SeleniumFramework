package testnglistener;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import TestClient.Tests.TestFile;
import bnkar.core.Reporting;

public class CustomTestNGListener extends Reporting implements
		IExecutionListener, ITestListener {

	public void onExecutionStart() {
		extent = ExtentReports.get("Automation project");
		extent.init("TestNGBasicSample1.html", true);
		System.out.println("Execution is started   ...");
	}

	public void onExecutionFinish() {
		extent.endTest();
		// TODO Auto-generated method stub
		System.out.println("execution finished and mail get sent");

	}
	/**
	 * This method log in to report on test case start
	 */
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		extent.startTest(result.getName(), " This test case");
		System.out.println("test is stated " + result.getName());

	}

	/**
	 * This method log in to report on test case pass
	 */

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extent.log(LogStatus.PASS, "test case is passed");
		System.out.println("test success");
	}
	
	/**
	 * This method log in to report on test case fail
	 */
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extent.log(LogStatus.FAIL, "test case is failed");

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}
	/**
	 * This method log in to report on test case on start
	 */
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test start");

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
