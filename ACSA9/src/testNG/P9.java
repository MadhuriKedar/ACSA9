package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P9 {
	
	@Test
	public void createUser() {
		
		Reporter.log("User created successfully",true);
		Assert.fail();//to fail the test case
	}
	
	@Test(dependsOnMethods="createUser")
	public void deleteUser() {
		
		Reporter.log("User deleted successfully",true);
	}
	
	@Test//(dependsOnMethods="createUser")
	public void editUser() {
		
		Reporter.log("User edited successfully",true);
	}

}
