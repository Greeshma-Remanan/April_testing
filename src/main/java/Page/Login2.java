package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	WebDriver driver;
	@FindBy(id="username") WebElement u;
	@FindBy(xpath="//input[@id='password']") WebElement p;
	@FindBy(xpath="//button[text()='Submit']") WebElement l;
	@FindBy(xpath="//a[text()='Log out']") WebElement log;
	
	@FindBy(xpath="//div[text()='Your username is invalid!']") WebElement err;
	
	public Login2(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void username(String user) {
		u.sendKeys(user);
	}
	public void password(String pass) {
		p.sendKeys(pass);
	}
	public void submit() {
		l.click();
	}
	public boolean error() {
		return err.isDisplayed();
	}
	public String error_text() {
		return err.getText();
	}
	
}


