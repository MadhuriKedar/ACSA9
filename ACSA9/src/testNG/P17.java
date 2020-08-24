package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P17 {	
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void googleTest() throws IOException {
		driver.get("http://www.google.com");
		String actual = driver.getTitle();
		Reporter.log("Actual: "+actual,true);
		String expected = "Google";
		Reporter.log("Expected: "+expected,true);
		boolean isTestPass = actual.equals(expected);
		if(isTestPass) {
			Reporter.log("Test is Passed",true);
		}
		else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("./photo/ss3.png");
			FileUtils.copyFile(src, des);
			Reporter.log("Test is failed",true);
		}
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		s.assertAll();
	}
	
	@Test
	public void fbTest() throws IOException {
		driver.get("http://www.facebook.com");
		String actual = driver.getTitle();
		Reporter.log("Actual: "+actual,true);
		String expected = "ABCD";
		Reporter.log("Expected: "+expected,true);
		boolean isTestPass = actual.equals(expected);
		if(isTestPass) {
			Reporter.log("Test is Passed",true);
		}
		else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("./photo/ss4.png");
			FileUtils.copyFile(src, des);
			Reporter.log("Test is failed",true);
		}
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		s.assertAll();
	}
		
	@AfterMethod
	public void closeApp() {
		
		driver.close();
	}

}
