package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junior1 {
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Senior s1=new Senior();
		s1.test(driver);
	}

}
