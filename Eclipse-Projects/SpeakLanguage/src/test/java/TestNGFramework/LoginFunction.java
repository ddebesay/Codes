package TestNGFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModels.LoginPage;
import PageObjectModels.base;


public class LoginFunction extends Root{
	

	@Test (priority = 2)	
	public void LoginWithValidCredentials () throws IOException, InterruptedException {
		LP.Credentials("ddebesay@gmail.com", "Danny@1995");
		LP.VerifyLoginUser();
		base.TakeScreenshot("Successful Login");
		
	}
	@Test (priority = 1)
	public void LoginWithInvalidCredentials () throws IOException, InterruptedException {
		LP.Credentials("1256@.com", "35695");
		Thread.sleep(3000);
		base.TakeScreenshot("Login With Invalid Data");
		
	}
	
}
