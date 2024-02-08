package RunnnerAPP;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageObjectModels.LoginPage;
import PageObjectModels.LogoutPage;
import PageObjectModels.base;

public class LoginPageTest {
	
	public static WebDriver driver;
	public static LoginPage LP;
	public static LogoutPage LOP;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = base.getdriver();
	
		LP = new LoginPage (driver);
		LP.LoginButton();
	//	LP.EmailAddressField();
	//	LP.PasswordField();
		LP.LoginButtonTwo();
		LP.VerifyLoginUser();
		base.TakeScreenshot("Login Verification");
		
		LOP = new LogoutPage(driver);
		LOP.SettingButton();
		LOP.LogoutButton();
		base.TakeScreenshot("Logout Verification");
		
		
		
	}

}
