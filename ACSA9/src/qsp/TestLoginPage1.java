package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage1 {//Junoir
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		LoginPage2 a1 = new LoginPage2(driver);
		a1.setUsername("abcd");
		Thread.sleep(2000);
		a1.setPassword("123");
		Thread.sleep(2000);
		a1.clickLogin();//page gets refreshed	
		Thread.sleep(5000);
		a1.setUsername("xyz");
		Thread.sleep(2000);
		a1.setPassword("456");
		Thread.sleep(2000);
		a1.clickLogin();
		Thread.sleep(5000);
		a1.setUsername("mno");
		Thread.sleep(2000);
		a1.setPassword("789");
		Thread.sleep(2000);
		a1.clickLogin();
		Thread.sleep(5000);
		a1.setUsername("admin");
		Thread.sleep(2000);
		a1.setPassword("manager");
		Thread.sleep(2000);
		a1.clickLogin();
		Thread.sleep(5000);
		driver.close();
	}
}
