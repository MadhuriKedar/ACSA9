package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P27 {//Automate the foll. scenario
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1.open the browser and goto google.com
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//2.type "java" in the search box,it will display auto suggestions.
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("java");
		//3.Find all the auto suggestions elements.
		Thread.sleep(1000);//this is very important
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		//4.Print the count of all auto suggestions.
		System.out.println("count of auto-suggestions: "+allAutoSugg.size());
		//5.click on the third auto suggestion.
		allAutoSugg.get(2).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
