package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P37 {
	//Automate the following scenarios
	//1.open the browser
	//2.go to the renew page of religare health insurance
	//3.enter policy number
	//4.select your date of birth
	//5.specify the contact number and click on "Let's Renew".
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("12345");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1998");
		driver.findElement(By.linkText("13")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
		driver.findElement(By.id("renew_policy_submit")).click();
		driver.close();
	}

}
