package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {//SENIOR
	private WebElement untb;//declaration
	private WebElement pwtb;//declaration
	private WebElement loginBtn;//declaration
	
	LoginPage1(WebDriver driver){
		untb = driver.findElement(By.id("username"));//initialization
		pwtb = driver.findElement(By.name("pwd"));//initialization
		loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));//initialization
	}
	
	public void setUsername(String usn) {
		untb.sendKeys(usn);//utilization
	}
	
	public void setPassword(String pwd) {
		pwtb.sendKeys(pwd);//utilization
	}
	
	public void clickLogin() {
		loginBtn.click();//utilization
	}
}
