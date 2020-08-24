package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.urbanladder.com");
		List<WebElement> sections = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		for(WebElement section:sections) {	
			System.out.println(section.getText());	
			Thread.sleep(200);
		}
		System.out.println("=================================");
		WebElement sales = driver.findElement(By.xpath("(//span[@class='topnav_itemname'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(sales).build().perform();
		Thread.sleep(2000);
		 List<WebElement> items = driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/descendant::a/span"));
		 System.out.println(items.size());//13
			for(WebElement item:items) {
				String a = item.getText();
				Thread.sleep(200);
				System.out.println(a);
			}
		driver.close();
	}

}
