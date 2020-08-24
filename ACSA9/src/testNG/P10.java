package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P10 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actual = driver.getTitle();//Google
		String expected = "Dinga";
		if(actual.equals(expected)) {
			
			Reporter.log("TEST PASSED",true);
		}
		else {
			
			Reporter.log("TEST FAILED",true);
			Assert.fail();
		}
		driver.close();//not be executed
	}

}
