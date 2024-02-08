package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement LoginButton;
	@FindBy(xpath = "//input[@name='email']")
	WebElement EmailAddressField;
	@FindBy (xpath = "//input[@name='password']")
	WebElement PasswordField;
	@FindBy(xpath = "//input[@id='login_button']")
	WebElement LoginButtonTwo;
	@FindBy (xpath = "//li[@id='nav_user']//a[normalize-space()='daniel']")
	                  	
	WebElement VerifyLogin;
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginButton () {
		LoginButton.click();
	}
	
	public void EmailAddressField () {
		EmailAddressField.sendKeys("ddebesay@gmail.com");
	}
	public void PasswordField () {
		PasswordField.sendKeys("Danny@1995");
	}
	
	public void LoginButtonTwo () {
		LoginButtonTwo.click();
	}
	public void VerifyLoginUser () throws InterruptedException  {
		Thread.sleep(5);
		String verifyLoginUser = VerifyLogin.getText();
		if (verifyLoginUser.equals("daniel"))  {
			System.out.println("Login Page Pass!!");
		} 
		else {
			System.out.println("Login FAil!!");
		}
		
}
}