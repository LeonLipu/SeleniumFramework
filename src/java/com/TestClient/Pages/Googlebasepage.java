package TestClient.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Googlebasepage {
	final WebDriver driver;
	@FindBy(how = How.NAME, using = "q")
	WebElement searchbox;

	@FindBy(how = How.XPATH, using = "//button[@value='Search']")
	WebElement searchbutton;

	public Googlebasepage(WebDriver driver) {
		this.driver = driver;
	}

	public Googlebasepage entervalue(String searchelement) {
		searchbox.sendKeys(searchelement);
		return new Googlebasepage(driver);
	}

	public Googlebasepage doSearch() {
		searchbutton.click();
		return new Googlebasepage(driver);
	}

}
