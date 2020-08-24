package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P35 {
	static {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://stagenget.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		//we get javascript popup
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();//goes to alert popup
		String popupText = alert.getText();
		System.out.println(popupText);
		alert.accept();//clicks on ok button of the popup
		//alert.dismiss();//works the same for alert popup as accept().
		Thread.sleep(3000);
		driver.close();
	}

}
