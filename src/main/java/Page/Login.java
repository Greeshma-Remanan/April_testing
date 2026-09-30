package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(id="username") WebElement u;
	@FindBy(xpath="//input[@id='password']") WebElement p;
	@FindBy(xpath="//button[text()='Submit']") WebElement l;
	@FindBy(xpath="//a[text()='Log out']") WebElement log;
	
	public Login(WebDriver driver) {
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
	public String link() {
		return driver.getCurrentUrl();		
	}
	public String sourcecode() {
		return driver.getPageSource();
	}
	public boolean logout() {
		return log.isDisplayed();
	}
	public void logout_b() {
		log.click();
	}
}
	
