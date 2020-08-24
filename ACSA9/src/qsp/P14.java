package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/C.html");
		WebElement l1 = driver.findElement(By.tagName("a"));
		System.out.println(l1.getText());
		System.out.println("==========================================");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no of links in webpage: " + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		Thread.sleep(2000);
		links.get(2).click();//to click amazon link
		Thread.sleep(2000);
		driver.close();

	}

}
