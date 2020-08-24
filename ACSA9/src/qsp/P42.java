package qsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P42 {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("http://www.seleniumhq.org");
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		driver.findElement(By.id("browsersExpand")).click();
		driver.findElement(By.xpath("//h3[text()='Firefox']/parent::div/child::p[contains(text(),'Gecko')]/child::a")).click();
		driver.findElement(By.xpath("//a[text()='geckodriver releases']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'geckodriver-v0.27.0-win64.zip')]")).click();
		Thread.sleep(5000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_S);
		r1.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		//r1.keyPress(KeyEvent.VK_ENTER);//to download
		r1.keyPress(KeyEvent.VK_ESCAPE);//to cancel popup
		Thread.sleep(3000);
		driver.close();
		
	}

}