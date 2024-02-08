package StepDefinitions;

import org.openqa.selenium.WebDriver;
import PageObjectModel.BaseClass;
import PageObjectModel.LoginPageObject;
import PageObjectModel.LogoutPageObject;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	
public class LoginStepDefinition {
	
	public WebDriver driver = BaseClass.getDriver();   //calling BaseClass object to launch the driver
	
	public LoginPageObject LP = new  LoginPageObject (driver); 
	
	public LogoutPageObject LO = new LogoutPageObject (driver);
	
	
	
	@After
	public void tearDown () {				// will quit after every methods
		driver.quit();
	}

	
	@Given("User is on the Saucedemo.com login page")
	public void user_is_on_the_saucedemo_com_login_page() {
	   driver.get("https://www.saucedemo.com/v1/");
	}

	@Given("User enter correct username")
	public void user_enter_correct_username() {
	   LP.userNameField("standard_user");
	}

	@Given("User enter correct password")
	public void user_enter_correct_password() {
	   LP.passwordField("secret_sauce");
	}

	@Given("User click Login button")
	public void user_click_login_button() {
	   LP.loginButton();
	}

	@Then("User will be taken to the product page")
	public void user_will_be_taken_to_the_product_page_outline() {
	    
	}
	@Then("User should verify Product page title")
	public void user_should_verify_product_page_title() throws InterruptedException {
	   LO.Logoutpage();
	}

	 
	
	


}
