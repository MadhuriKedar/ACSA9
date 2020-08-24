package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("1st page title: "+driver.getTitle());
		driver.get("http://www.fb.com");
		System.out.println("2nd page title: "+driver.getTitle());
		driver.navigate().to("http://www.flipkart.com");
		System.out.println("3rd page title: "+driver.getTitle());
		driver.navigate().to("http://www.amazon.com");//similar to get() method,enters url
		System.out.println("4th page title: "+driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().back();//goes to previous page
		Thread.sleep(4000);
		driver.navigate().forward();//goes to next page
		Thread.sleep(2000);
		driver.navigate().refresh();//refreshes the current page
		Thread.sleep(2000);
		driver.close();
	}
}
