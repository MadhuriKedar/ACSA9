package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P15 {
	
	@BeforeMethod
	public void xyz() {
		
		Reporter.log("from @BeforeMethod(xyz())",true);
	}
	
	@AfterMethod
	public void abc() {
		
		Reporter.log("from @AfterMethod(abc())",true);
	}
	
	@Test
	public void testA() {
		
		Reporter.log("from @Test(testA())",true);
	}
	
	@Test
	public void testB() {
		
		Reporter.log("from @Test(testB())",true);
	}


}
