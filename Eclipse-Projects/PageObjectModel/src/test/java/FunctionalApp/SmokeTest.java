package FunctionalApp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectModel.Base;
import PageObjectModel.LoginPage;

public abstract class SmokeTest {
	static WebDriver driver;
	static LoginPage lp;				// You can make it static 
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = Base.getDriver();
		lp.successfulLoginPage(null, null);		// call it shorter ORRR
		
		// Both way are the same
	
		LoginPage lp = new LoginPage(driver);
	
		lp.successfulLoginPage("standard_user", "secret_sauce");
		Base.takeScreenshot("Valid Login");
	
		
		

	}

}
