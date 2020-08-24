package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junior2 {
	static {
		System.setProperty("webdriver.gecko.driver" , "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		Senior s1=new Senior();
		s1.test(driver);

	}

}
