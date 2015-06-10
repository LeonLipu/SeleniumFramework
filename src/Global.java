import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Global {

	public static void main (String [] args){
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com/");
		System.out.println(driver.getPageSource());
		
	
	}
}
