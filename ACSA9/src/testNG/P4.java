package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P4 {

	@Test
	public void test() {
		
		Reporter.log("Qspiders");//report
		Reporter.log("Jspiders",false);//report
		Reporter.log("Dinga",true);//report & console
	}

}
