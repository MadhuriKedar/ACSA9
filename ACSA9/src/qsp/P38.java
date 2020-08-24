package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P38 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
System.out.println("No. of browsers present:"+allwindowHandles.size());
		for( String x : allwindowHandles) {
			
			boolean notParent = !(x.equals(parent));
			
			if(notParent) {
				driver.switchTo().window(x).close();
			}
			Thread.sleep(3000);	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
