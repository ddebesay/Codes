package StepDefinitions;

import org.openqa.selenium.WebDriver;
import PageObjectModel.BaseClass;
import PageObjectModel.LoginPageObject;
import PageObjectModel.LogoutPageObject;
import PageObjectModel.ProductPageObject;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class ProductStepDefinitions {
	
	private WebDriver driver = BaseClass.getDriver();   
	
	public LoginPageObject LP = new  LoginPageObject (driver); 
	public LogoutPageObject LO = new LogoutPageObject (driver);
	private ProductPageObject PP = new ProductPageObject (driver);
	
	
	@After
	public void tearDown () {			
		driver.quit();
	}
	
	@Given("User is will be in Product page")
	public void user_is_will_be_in_product_page() {
		LP.userNameField("standard_user");
		LP.passwordField("secret_sauce");
		LP.loginButton();
		PP.verifyPageTitle();
	}

	@When("User select product sorting with High to Low")
	public void user_select_product_sorting_with_high_to_low() throws InterruptedException {
	   PP.SelectSortHightoLow();
	}

	@Then("{string} will come first")
	public void will_come_first(String productName) {
 
	}

	@When("User select product sorting with Low to High")
	public void user_select_product_sorting_with_low_to_high() throws InterruptedException {
	    PP.SelectSortLowtoHigh();
	    System.out.println("-----------------------------------------------");
	}
	
	
	
	@Given("User will be located in Product page")
	public void user_will_be_located_in_product_page() {
	    PP.verifyPageTitle();
	}

	@When("User automate the product counts")
	public void user_automate_the_product_counts() {
	    PP.checkProductCount();
	}

	@Then("User should recieve a count of {int} products")
	public void user_should_recieve_a_count_of_products(Integer int1) {
	 
	}

	
}
