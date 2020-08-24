package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage2 {//SENIOR
	@FindBy(id="username")
	private WebElement untb;//declaration
	@FindBy(name="pwd")
	private WebElement pwtb;//declaration
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;//declaration
	
	LoginPage2(WebDriver driver){
		
		PageFactory.initElements(driver, this);	//DESIGN PATTERN
		
	}	
	public void setUsername(String usn) {
		untb.sendKeys(usn);//utilization
	}	
	public void setPassword(String pwd) {
		pwtb.sendKeys(pwd);//utilization
	}	
	public void clickLogin() {
		loginBtn.click();//utilization
	}
}