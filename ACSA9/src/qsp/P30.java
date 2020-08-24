package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P30 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.name("firstname")).sendKeys("Prathmesh");
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pari");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("13");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("3");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByIndex(23);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio' and @id='u_0_7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
