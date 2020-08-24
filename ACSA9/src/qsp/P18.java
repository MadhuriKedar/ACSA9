package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/E.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("./html/body/div[2]/a[2]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("./html/body/div[2]/input")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("./html/body/div[1]/input")).sendKeys("wxyz");
		Thread.sleep(2000);
		driver.close();

	}

}
