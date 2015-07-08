package bnkar.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.relevantcodes.extentreports.LogStatus;

import testnglistener.CustomTestNGListener;

public class CustomWebdriverListener extends CustomTestNGListener implements
		WebDriverEventListener {

	static Logger log = Logger.getLogger(CustomWebdriverListener.class);

	public static void main(String[] args) {
		System.out.println("something ");

	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		log.info("Before navigation to url :" + url);
		// extent.log(LogStatus.INFO,"Before navigation to url :"+url);
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("After navigation to url :" + url);
		// extent.log(LogStatus.INFO,"After navigation to url :"+url);

	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		log.info("before finding element by " + by);

	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("After finding element by " + by);
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		log.info("Before clicking on text " + element.getText()
				+ " and tagname " + element.getTagName());

	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		log.info("After clicking on text " + element.getText()
				+ " and tagname " + element.getTagName());
		extent.log(LogStatus.INFO,
				"After clicking on text " + element.getText() + " and tagname "
						+ element.getTagName());
		extent.attachScreenshot(createScreenshot(driver)," click");

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {

		log.info("Before changing  and tagname " + element.getTagName());
		extent.log(LogStatus.INFO,
				"Before entering value  " + element.getTagName());
		
		extent.attachScreenshot(createScreenshot(driver)," input");
		// TODO Auto-generated method stub

	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("After entering value  " + element.getTagName());

		extent.log(LogStatus.INFO,
				"After entering value  " + element.getTagName());
		
		extent.attachScreenshot(createScreenshot(driver)," input");
		//createScreenshot();
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub

	}
}
