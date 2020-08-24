package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();//maximizes the browser
		Thread.sleep(2000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("abcdxyz");//switches to active element and types
		Thread.sleep(2000);
		driver.close();
	}

}
