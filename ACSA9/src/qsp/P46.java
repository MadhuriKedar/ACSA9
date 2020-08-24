package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P46 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("8660281165");
		driver.findElement(By.id("pass")).sendKeys("Nikki@123");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@role='navigation'])[2]/child::span/child::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
