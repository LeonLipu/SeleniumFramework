package com.bnkar.locator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test
  @Parameters("configPath")
  public void f(String path) {
  System.out.println("hello");
  System.out.println("melody id no");
  System.out.println("it is my print statement");
  System.out.println(System.getProperty("exeFolder"));//mvn test -DexeFolder="something"
	  System.out.println(path);
  }

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
