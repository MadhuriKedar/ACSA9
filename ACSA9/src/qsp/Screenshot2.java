package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;//typcasting
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./photo/google.png");
		FileUtils.copyFile(src, des);
		driver.close();

	}

}
