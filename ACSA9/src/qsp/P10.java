package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		String add = driver.getWindowHandle();
		System.out.println("Address of GUI object:"+add);
		driver.close();
	}

}
