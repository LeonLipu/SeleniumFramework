package TestClient.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Googlebasepage {
	
	@FindBy(how = How.NAME ,using="q")
	WebElement searchbox;

	
	
}
