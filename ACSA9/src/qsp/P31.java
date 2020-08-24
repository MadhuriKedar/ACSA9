package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P31 {
	
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");//enters url and waits till first page is loaded
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(50);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(50);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
