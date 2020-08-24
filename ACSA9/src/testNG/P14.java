package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P14 {
	@BeforeMethod
	public void setp()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actual = driver.getTitle();//Google
		String expected = "Dinga";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		driver.close();
		s.assertAll();
	}
	
	@AfterMethod
	public void end()
	{
		System.out.println("P14 end()");
	}

}
