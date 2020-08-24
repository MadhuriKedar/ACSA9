package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P28 {
	//Automate the foll. scenario
	//1.open the browser and goto cleartrip.com
	//2.type "ban" in 'from text field',it will display autosuggestion
	//3.print the text present in all the auto suggestion
	//4.select 1st auto suggestion
	//5.wait for 3 seconds and close the browser

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cleartrip.com");
		Thread.sleep(3000);
		WebElement tb = driver.findElement(By.id("FromTag"));
		Thread.sleep(3000);
		tb.sendKeys("ban");
		Thread.sleep(5000);
		List<WebElement> autosuggs=driver.findElements(By.xpath("//a[contains(.,'Ban') and not(@title)]"));
		System.out.println(autosuggs.size());
		for(int i=0;i<autosuggs.size();i++) {
			System.out.println(autosuggs.get(i).getText());
		}
		/*for(WebElement a:autosuggs){
			System.out.println(a.getText());
		}*/
		//Thread.sleep(2000);
		autosuggs.get(0).click();
		Thread.sleep(2000);
		driver.close();
	}

}
