package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("dinga@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("dingi i love you");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("jhinga");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("jingalala");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
