package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P34 {
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		int count=0;
		while(true) {
			try {
				driver.findElement(By.xpath("//div[text()='Tasks']")).click();
				break;
			}
			catch(Exception e) {
				count++;
				System.out.println("exception caught "+count+" times");		
			}
		}	
		driver.findElement(By.id("logoutLink")).click();
		driver.close();					
	}
}
