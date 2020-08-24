package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.vtiger.com");
		WebElement resourceLink = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Thread.sleep(3000 );
		Actions act = new Actions(driver);
		act.moveToElement(resourceLink).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
WebElement contactNum = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/parent::div/child::p[2]"));
		System.out.println(contactNum.getText());
		Thread.sleep(5000);
		driver.close();

	}

}
