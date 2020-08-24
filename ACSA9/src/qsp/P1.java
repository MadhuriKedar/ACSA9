package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();//open the chrome browser
		Thread.sleep(5000);//sleep for 5 seconds
		driver.close();//close the browser
	}
}
