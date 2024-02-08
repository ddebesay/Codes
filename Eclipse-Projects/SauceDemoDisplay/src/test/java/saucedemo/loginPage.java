package saucedemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	@FindBy (xpath = "//input[@id='password']")
	WebElement Password;
	@FindBy (xpath = "//input[@id='login-button']")
	WebElement loginButton; 
	
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Usernamefield (String username) {
		Username.sendKeys(username);
	}
	
	public void Passwordfield (String password) {
		Password.sendKeys(password);
	}
	public void loginbuttons () {
		loginButton.click();
	} 
}
