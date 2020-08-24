package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom_excel {//Junior
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		LoginPage2 a1 = new LoginPage2(driver);//Pom class object
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=5;i++) {
			String usn = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			Thread.sleep(1000);
			a1.setUsername(usn);
			String pwd = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			Thread.sleep(1000);
			a1.setPassword(pwd);
			a1.clickLogin();
			Thread.sleep(3000);
		}
		Thread.sleep(5000);
		driver.close();
	}
}
