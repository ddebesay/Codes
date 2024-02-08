package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='user-name']")
	static WebElement userNameField; 
	@FindBy(xpath = "//input[@id='password']")
	static WebElement passwordField;
	@FindBy(xpath = "//input[@id='login-button']")
	static WebElement loginButton;
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userNameField (String EnterUsername) {
		userNameField.sendKeys(EnterUsername);
	}
	public void passwordField (String EnterPassword) {
		passwordField.sendKeys(EnterPassword);
	}
	public void loginButton () {
		loginButton.click();
	}
	public void successfulLoginPage (String EnterUsername, String EnterPassword) {
		LoginPage lp = new LoginPage(driver);
		lp.userNameField(EnterUsername);
		lp.passwordField(EnterPassword);
		lp.loginButton();
	}
	
	}

