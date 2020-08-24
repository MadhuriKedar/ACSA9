package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P13 {

	@Test
	public void testA() {
		
		SoftAssert s = new SoftAssert();
		Reporter.log("testA starts",true);
		s.assertEquals("abc", "xyz");//false
		//still further stmts gets executed 
		Reporter.log("testA ends",true);
		s.assertAll();//mandatory
	}
	
	@Test
	public void testB() {
		
		Reporter.log("testB starts",true);
		Reporter.log("testB ends",true);
	}
}
