package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	@FindBy(xpath = "//input[@id='user-name']")
	 WebElement userNameField; 
	@FindBy(xpath = "//input[@id='password']")
	 WebElement passwordField;
	@FindBy(xpath = "//input[@id='login-button']")
	 WebElement loginButton;
	
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
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
	public void successfulLoginPage (String validUsername, String ValidPassword) {
		LoginPageObject lp = new LoginPageObject(driver);
		lp.userNameField(validUsername);
		lp.passwordField(ValidPassword);
		lp.loginButton();
}
}