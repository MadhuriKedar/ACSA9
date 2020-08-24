package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P47 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		String firstTab = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Thread.sleep(5000);
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println("total tabs: "+allTabs.size());
		for(String x:allTabs) {
			boolean notFirstTab = !(x.equals(firstTab));
			if(notFirstTab) {
				WebDriver tab = driver.switchTo().window(x);
List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='main-menu__ul']/descendant::a[@class='main-menu__link']"));
				for(int i=0;i<allLinks.size();i++) {
					String link = allLinks.get(i).getText();
					System.out.println(link);
				}
				tab.close();
			}
			Thread.sleep(2000);
		}
		driver.switchTo().window(firstTab);
		driver.close();
		
		

	}

}
