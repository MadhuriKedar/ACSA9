package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P16 {
	
	@BeforeMethod
	public void apple() {
		
		System.out.println("@BeforeMethod(apple)");
	}
	
	@BeforeClass
	public void mango() {
		
		System.out.println("@BeforeClass(mango)");
	}
	
	@AfterClass
	public void orange() {
		
		System.out.println("@AfterClass(orange)");
	}
	
	@Test
	public void banana() {
		System.out.println("@Test(banana)");
	}
	
	@Test
	public void ginger() {
		System.out.println("@Test(ginger)");
	}
	
	@AfterMethod
	public void grapes() {
		
		System.out.println("@AfterMethod(grapes)");
	}
	
	

}
