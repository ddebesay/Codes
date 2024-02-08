package RunnnerAPP;

import org.openqa.selenium.WebDriver;

import PageObjectModels.LoginPage;
import PageObjectModels.base;

public class Regression {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = base.getdriver();
		
		LoginPage LP = new LoginPage (driver);
		LP.LoginButton();
		LP.EmailAddressField();
		LP.PasswordField();
		LP.LoginButtonTwo();
		LP.VerifyLoginUser();
		
		driver = base.tearDown();
	}

}
