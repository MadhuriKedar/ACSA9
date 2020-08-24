package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot)driver;//typcasting 
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./photo/A1.png");
		FileUtils.copyFile(src1, des1);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File des2 = new File("./photo/A2.png");
		FileUtils.copyFile(src2, des2);
		Thread.sleep(3000);
		driver.close();
	}

}
