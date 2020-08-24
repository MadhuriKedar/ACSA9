package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		WebElement untb = driver.findElement(By.xpath("//input[@id='username']"));
		untb.sendKeys("admin");
		Thread.sleep(1500);
		WebElement pwtb = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwtb.sendKeys("manager");
		Thread.sleep(1500);
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		loginButton.click();
		Thread.sleep(5000);
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		Thread.sleep(3000);
		driver.close();

	}

}
