package bnkar.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class CustomWebdriverListener implements WebDriverEventListener{

	 static Logger log = Logger.getLogger(CustomWebdriverListener.class);
	
	public static void main(String[] args) {
		System.out.println("something ");
		
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		log.info("Before navigation to url :"+url);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("After navigation to url :"+url);
		
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
		log.info("before finding element by "+by);
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("After finding element by "+by);
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		log.info("Before clicking on text "+element.getText()+ " and tagname "+element.getTagName());
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		log.info("After clicking on text "+element.getText()+ " and tagname "+element.getTagName());
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		
		log.info("Before changing  and tagname "+element.getTagName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		log.info("Before changing  and tagname "+element.getTagName());
		
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
