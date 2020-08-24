package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P6 {

	@Test(priority=2,invocationCount=2)
	public void carrot() {

		Reporter.log("from carrot",true);
	}
	
	@Test(priority=3,invocationCount=3)
	public void apple() {
		
		Reporter.log("from apple",true);
		
	}
	
	@Test(priority=1,invocationCount=5)
	public void banana() {
		
		Reporter.log("from banana",true);
	}
}
