package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P43 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		File f = new File("./cv/ActiTIME doc.docx");
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		WebElement uploadCVButton = driver.findElement(By.id("wdgt-file-upload"));
		Thread.sleep(4000);
		uploadCVButton.sendKeys(absolutePath);
		Thread.sleep(4000);
		driver.close();

	}

}
