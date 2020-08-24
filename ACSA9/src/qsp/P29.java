package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P29 {//K.html
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Webpages/K.html");
		WebElement taj = driver.findElement(By.id("taj"));
		Select s1 = new Select(taj);
		System.out.println("TAJ: "+s1.isMultiple());//true
		Thread.sleep(2000);
		s1.selectByIndex(0);//biryani
		Thread.sleep(1000);
		s1.selectByValue("pav");//pav bhaji
		Thread.sleep(1000);
		s1.selectByVisibleText("Idly");//Idly
		Thread.sleep(3000);
	 	List<WebElement> selectedItems = s1.getAllSelectedOptions();
	 	for( WebElement so:selectedItems) {
	 		System.out.println(so.getText());
	 	}
	 	System.out.println("First selected option:"+s1.getFirstSelectedOption().getText());//biryani
		s1.deselectByIndex(1);// deselect Idly
		Thread.sleep(1000);
		s1.deselectByValue("bir");// deselect Biryani
		Thread.sleep(1000);
		s1.deselectByVisibleText("Pav Bhaji");// deselect Pav Bhaji
		//s1.deselectAll();
		Thread.sleep(3000);
		System.out.println("========================");
		WebElement oberoi = driver.findElement(By.id("oberoi"));
		Select s2 = new Select(oberoi);
		System.out.println(s2.isMultiple());//false
		s2.selectByVisibleText("Boost");
		Thread.sleep(3000);
		List<WebElement> options = s2.getOptions();
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		//s2.deselectByVisibleText("Boost");//UnsupportedOperationException
		driver.close();
		
		
		
		
		

	}

}
