package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Senior {
	//this method works for all the browsers
	public void test(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}

}
