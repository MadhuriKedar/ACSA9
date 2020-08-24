package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21 {//G.html
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/G.html");
		WebElement java_price = driver.findElement(By.xpath("//a[text()='JAVA']/../../../td[2]//a"));
		java_price.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='SQL']/../../../td[2]//a")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
