package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P5 {
	
	@Test(priority=1)
	public void zinga() {
		Reporter.log("from zinga",true);
	}
	
	@Test(priority=0)
	public void bazinga() {
		Reporter.log("from bazinga",true);
	}
	
	@Test(priority=1)
	public void dingi() {
		Reporter.log("from dingi",true);
	}
	
	@Test(priority=-4)
	public void dinga() {
		
		Reporter.log("from dinga",true);
	}

}
