package com.bnkar.locator;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test(retryAnalyzer=Retrylistener.class)
	@Parameters("configPath")
	public void Mybeningtest(String path) {
	//	System.out.println("it is my test case part 2");
		
		System.out.println("it is my first test case");
/*		System.out.println("melody id no");
		System.out.println("it is my print statement");
		System.out.println(System.getProperty("exeFolder"));// mvn test
															// -DexeFolder="something"
		System.out.println(path);//parameter from testng
*/	}
	
	@Test
	public void newsecondtest(){
		Assert.assertEquals(false, true);
		System.out.println("onesecondtestcase");
	}



	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
