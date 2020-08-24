package qsp;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class P2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver1 = new ChromeDriver();
		Thread.sleep(2000);
		FirefoxDriver driver2 = new FirefoxDriver();
		Thread.sleep(2000);
		driver2.close();
		Thread.sleep(2000);
		driver1.close();
		
		
		

		
	
		
		
		

	}

}
