package TestRunners;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.CartPage;
import Pages.CheckOutInfoPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ProductPage;
import TestNGFrameWork.Base;

public class BaseTest {   // reason of this class is like a storage. we will extend to the test runner apps.. easier to log in and test next page 
	
	public  WebDriver driver;
	public  LoginPage lp;
	public  ProductPage pp;
	public  CartPage cp;
	public  CheckOutInfoPage cop;
	public  LogoutPage lop;
	
	
	// this methiod shouild run before class 
	@BeforeClass (alwaysRun = true)
	 void initialPageAndLogin () throws FileNotFoundException, IOException {   
		driver = Base.getDriver();
		lp = new LoginPage(driver);
		lp.successfulLoginPage("standard_user", "secret_sauce");
		pp = new ProductPage(driver);
		cp = new CartPage(driver);
		cop = new CheckOutInfoPage(driver);
		lop = new LogoutPage(driver);
		
		
	}
	
	
	//this method will quit 
	@AfterClass(alwaysRun = true)
	 void tearDown () throws InterruptedException {
		
		Thread.sleep(Duration.ofSeconds(3));
		lop.Logoutpage();
		driver.quit();
	}
}
