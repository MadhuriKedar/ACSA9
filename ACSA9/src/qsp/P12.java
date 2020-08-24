package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12 {//B.html
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/B.html");
		Thread.sleep(2000);
		driver.findElement(By.id("usn")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("abc")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
