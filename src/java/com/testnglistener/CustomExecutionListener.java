package testnglistener;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import bnkar.core.Reporting;

public class CustomExecutionListener extends Reporting  implements IExecutionListener, ITestListener 	{

	
	public void onExecutionStart() {
		System.out.println("Execution is started   ...");
	}

	
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("execution finished and mail get sent");
		
	}

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test is stated ");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test success");
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test start");
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	


	

}
