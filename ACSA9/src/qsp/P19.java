package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("No. of links: "+allLinks.size());//59
		Thread.sleep(3000);
		int count=0;
		for(WebElement link : allLinks) {
			System.out.println(count+"). "+link.getText());
			count++;
		}
		driver.close();
	}

}
