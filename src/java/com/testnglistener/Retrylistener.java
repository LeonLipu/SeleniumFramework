package testnglistener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylistener implements IRetryAnalyzer {
int retrycount=0;
int maxretry=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycount<maxretry	)
		{

			System.out.println(result.getStatus()+" is status ");
			System.out.println(result.getName()+" test case name");
			System.out.println(retrycount+" this retry count");
			retrycount=retrycount+1;
			return true;
		}
		
		
		
		return false;
	}

}
