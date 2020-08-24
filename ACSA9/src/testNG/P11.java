package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actual = driver.getTitle();//Google
		String expected = "Dinga";
		Assert.assertEquals(actual, expected);//fails the test case
		//further statements wont get executed
		System.out.println("bye");
		driver.close();
		
	}

}
