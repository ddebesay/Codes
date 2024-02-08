package TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import PageObjectModels.FooterPage;
import PageObjectModels.HomePage;
import PageObjectModels.LoginPage;
import PageObjectModels.LogoutPage;
import PageObjectModels.SignUpPage;
import PageObjectModels.base;

public class Root {
	public WebDriver driver;
	public LoginPage LP;
	public HomePage HP;
	public SignUpPage SP;
	public FooterPage FP;
	public LogoutPage LOP;
	
	@BeforeClass(alwaysRun = true)
	 void initialPage () {
		driver = base.getdriver();
		LP = new LoginPage(driver);
		HP = new HomePage(driver);
		SP = new SignUpPage(driver);
		FP = new FooterPage(driver);
		LOP = new LogoutPage(driver);
	}
	
	@AfterClass
	public void tearDwon () throws InterruptedException {
		LOP.SettingButton();
		LOP.LogoutButton();
		driver.close();
		driver.quit();
	}
}
