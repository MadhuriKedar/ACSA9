package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P8 {
	
	@Test(groups="s")
	public void createUser() {
		
		Reporter.log("User created successfully",true);
	}
	
	@Test(groups="m",priority=2)
	public void deleteUser() {
		
		Reporter.log("User deleted successfully",true);
	}
	
	@Test(groups="s")
	public void editUser() {
		
		Reporter.log("User edited successfully",true);
	}

}
