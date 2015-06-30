package com.bnkar.locator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	
	
	//@Test(retryAnalyzer=AnotatorForRetry.class)
	@Test()
	public void test1(){
		System.out.println("testng test case for secand suite file");
		Assert.assertEquals("hello", "some");
	}
	@Test()
	public void test2(){
		System.out.println("testng test ca");
		Assert.assertEquals("hello", "hello");
	}

}
