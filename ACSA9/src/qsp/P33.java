package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P33 {

	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		String firstPageTitle = driver.getTitle();
		System.out.println("First Page title: "+ firstPageTitle);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("admin");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pwd")));
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Login ']")));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		wait.until(ExpectedConditions.titleContains("Enter"));//condition-1
		String secondPageTitle = driver.getTitle();
		System.out.println("Second Page title: "+ secondPageTitle);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		
		wait.until(ExpectedConditions.titleContains("Task"));//condition-2
		String ThirdPageTitle = driver.getTitle();
		System.out.println("Third Page title: "+ ThirdPageTitle);
		driver.findElement(By.id("logoutLink")).click();
		
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String FourthPageTitle = driver.getTitle();
		System.out.println("Fourth Page title: "+ FourthPageTitle);
		
		if( firstPageTitle.equals(FourthPageTitle) ) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
