package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P49 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/Page1.html");
		driver.findElement(By.id("usn")).sendKeys("A");
		driver.switchTo().frame(0);//index of inner frame
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("1");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();//goes to the previous frame
		driver.findElement(By.id("usn")).sendKeys("B");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");//id of inner frame
		driver.findElement(By.id("pwd")).sendKeys("2");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();//goes to the frame that  you opened
		driver.findElement(By.id("usn")).sendKeys("C");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);//goes to the frame webelement
		driver.findElement(By.id("pwd")).sendKeys("3");
		Thread.sleep(4000);
		driver.close();
	}

}
