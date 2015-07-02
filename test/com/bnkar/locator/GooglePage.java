package com.bnkar.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage {
	final WebDriver driver;

	@FindBy(how = How.NAME, using = "q")
	WebElement searchbox;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}

	public GooglePage entervalue() {
		
		
        searchbox.sendKeys("something");
		return new GooglePage(driver);
	}

}
