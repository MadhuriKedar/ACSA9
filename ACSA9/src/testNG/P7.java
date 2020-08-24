package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P7 {
	
	@Test(invocationCount=2)
	public void createUser() {
		
		Reporter.log("User created successfully",true);
	}
	
	@Test(priority=2)
	public void deleteUser() {
		
		Reporter.log("User deleted successfully",true);
	}
	
	@Test
	public void editUser() {
		
		Reporter.log("User edited successfully",true);
	}

}
