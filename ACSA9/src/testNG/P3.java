package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P3 {
	
	@Test
	public void car() {//prints only in Report & not in console
		
		Reporter.log("from car");
	}
	
	@Test
	public void pineApple() {//prints only in Report & not in console
		
		Reporter.log("from pineapple", false);
	}
	
	@Test
	public void jackFruit() {//prints both in console and report
		
		Reporter.log("from jackfruit",true);
	}
	
	@Test
	public void grapes() {//prints only in console
		
		System.out.println("from grapes");
	}

}
