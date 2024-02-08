package FunctionalApp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectModel.Base;
import PageObjectModel.Cart;
import PageObjectModel.CheckOutInfo;
import PageObjectModel.LoginPage;
import PageObjectModel.Logout;
import PageObjectModel.ProductPage;


public class RegressionTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = Base.getDriver();
		
		LoginPage LP = new LoginPage (driver);
		LP.successfulLoginPage("standard_user", "secret_sauce");
		Base.takeScreenshot("Successful Login");
			
		ProductPage PP = new ProductPage (driver);
		PP.successfulHomePage();
		
		Cart CT = new Cart (driver);
		CT.AddtoCart();
		
		CheckOutInfo COI = new CheckOutInfo(driver);
		COI.checkoutInfo("Jon", "Smith", "22351");
		Base.takeScreenshot("Successful Purchase");
		
		Logout LO = new Logout (driver);
		LO.Logoutpage();
		
	}		

}
