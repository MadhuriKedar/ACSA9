package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P44 {//L.html
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/L.html");
		WebElement uploadButton = driver.findElement(By.id("cv"));
		File f = new File("./cv/ActiTIME doc.docx");
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		Thread.sleep(4000);
		uploadButton.sendKeys(absolutePath);
		Thread.sleep(4000);
		driver.close();

	}

}
