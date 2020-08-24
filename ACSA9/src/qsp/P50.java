package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P50 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		WebElement emailTB = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		emailTB.sendKeys("dinga@gmail.com");//if we perform action after refreshing the page

	}

}
