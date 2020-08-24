package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26 {//J.html
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/J.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//input"));
		System.out.println("size: "+allLinks.size());
		for( WebElement x : allLinks ) {
			
			System.out.println(x.getText());
			
		}
		driver.close();
		
	}

}
