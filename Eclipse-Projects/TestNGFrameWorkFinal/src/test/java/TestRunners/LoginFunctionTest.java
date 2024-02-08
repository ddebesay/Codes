package TestRunners;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestNGFrameWork.Base;

public class LoginFunctionTest {
	
	WebDriver driver;
	LoginPage lp;
	
	
	@Test (priority = 1)
	void loginTest () throws FileNotFoundException, IOException, InterruptedException {
		driver = Base.getDriver();
		lp = new LoginPage(driver);
		lp.successfulLoginPage("standard_user", "secret_sauce");
		Base.takeScreenshot("succesful Login");
		
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();
	}
	
	@Test (priority = 2)
	void InvalidloginTest () throws FileNotFoundException, IOException, InterruptedException {
		driver = Base.getDriver();
		lp = new LoginPage(driver);
		lp.successfulLoginPage("locked_out_user", "secret_sauce");
		Base.takeScreenshot("Unsuccesful Login");
		
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();
	}
}
