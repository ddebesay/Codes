package StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import PageObjectModels.Base;
import PageObjectModels.LoginPage;
import PageObjectModels.LogoutPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class loginStepDef {
	WebDriver driver = Base.getDriver();
	LoginPage LP = new LoginPage (driver);
	LogoutPage LO = new LogoutPage (driver);
	
	@Given("User is on the Saucedemo.com login page")
	public void user_is_on_the_saucedemo_com_login_page() throws IOException {
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}

	@Given("User enter correct username {string}")
	public void user_enter_correct_username(String username) {
	    LP.userNameField(username);
	}

	@Given("User enter correct password {string}")
	public void user_enter_correct_password(String password) {
		LP.passwordField(password);
	}


	@Given("User click Login button")
	public void user_click_login_button() {
		LP.loginButton();
	}

	@Then("User will be taken to the product page")
	public void user_will_be_taken_to_the_product_page() throws IOException {
	   Base.takeScreenshot("successful Login");
	}
	//------------------------------------------------//
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		}

	@Given("User enter correct USERNAME  username {string}")
	public void user_enter_correct_username_username(String username) {
		LP.userNameField(username);
	}

	@Given("User enter correct PASSWORD password {string}")
	public void user_enter_correct_password_password(String password) {
		LP.passwordField(password);
	}

	@Given("User click the Loginbutton")
	public void user_click_the_loginbutton() {
		LP.loginButton();
	}

	@Then("User should get the {string} code")
	public void user_should_get_the_code(String status) throws IOException {
		Base.takeScreenshot(status);
	   
	}
	@After
	public void pageLogout() throws InterruptedException {
		LO.Logoutpage();
		driver.quit();
	}
}
