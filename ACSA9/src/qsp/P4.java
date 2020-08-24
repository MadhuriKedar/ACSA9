package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//open chrome browser
		driver.get("http://www.facebook.com");//enter the url
		String title2 = driver.getTitle();//fetches the title of the page
		System.out.println("title of the webpage: " + title2);
		String url = driver.getCurrentUrl();//fetches the present url of the page
		System.out.println("URL of the page: "+url);
		driver.close();//closes the chrome browser

	}

}
