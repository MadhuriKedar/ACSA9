package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/C.html");
		WebElement googleLink = driver.findElement(By.id("a1"));
		googleLink.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		WebElement fbLink = driver.findElement(By.className("h2"));
		fbLink.click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.linkText("AMAZON")).click();//works only for link
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("ASHA")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
