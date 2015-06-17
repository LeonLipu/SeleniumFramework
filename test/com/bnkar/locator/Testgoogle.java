package com.bnkar.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import bnkar.core.CustomPageFactory;

public class Testgoogle {
	public static void main(String[] args) {
		System.out.println("something");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		GooglePage gp=CustomPageFactory.initElements(driver,GooglePage.class);
		gp.searchbox.sendKeys("hello");
	}
}
