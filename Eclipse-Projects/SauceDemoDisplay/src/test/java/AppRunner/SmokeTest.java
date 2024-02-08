package AppRunner;

import org.openqa.selenium.WebDriver;

import saucedemo.DriverBase;
import saucedemo.loginDisplayed;
import saucedemo.loginPage;

public class SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverBase.driver();
		
		//Display Check
		loginDisplayed display = new loginDisplayed (driver);
		display.titlePage("Swag Labs");
		display.Logodisplayed();
		display.usernameDisplayed();
		display.passwordDisplayed();
		
		loginPage lp = new loginPage (driver); 
		lp.Usernamefield(null);
		
		
		
	}

}
