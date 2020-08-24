package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P12 {
	
	@Test
	public void testA() {
		
		Reporter.log("testA starts",true);
		Assert.assertEquals("abc", "xyz");//failed
		//further stmts of the method wont get executed
		Reporter.log("testA ends",true);
	}
	
	@Test
	public void testB() {
		
		Reporter.log("testB starts",true);
		Reporter.log("testB ends",true);
	}
		
	

}
