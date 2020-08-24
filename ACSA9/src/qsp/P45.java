package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class P45 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.get("http://www.fb.com");
	
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_CONTROL);
	r1.keyPress(KeyEvent.VK_P);
	r1.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r1.keyPress(KeyEvent.VK_ALT);
	r1.keyPress(KeyEvent.VK_G);
	r1.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(5000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.close();
	}
}
