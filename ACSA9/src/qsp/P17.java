package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/D.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("./html/body/a")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
