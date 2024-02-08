package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageObjectModels.Base;
import PageObjectModels.LoginPage;
import PageObjectModels.ProductPage;
import io.cucumber.java.en.*;

public class ProductStepDef {
	
	WebDriver driver = Base.getDriver();
	LoginPage LP = new LoginPage (driver);
	ProductPage PP = new ProductPage (driver);
	
	@Given("User is on the Product home page")
	public void user_is_on_the_product_home_page() {
	   LP.successfulLoginPage("standard_user", "secret_sauce"); 
	}

	@Given("User Selects the sorting button to Low to high")
	public void user_selects_the_sorting_button_to_low_to_high() throws InterruptedException {
	    PP.LowtoHighSorting();
	}

	@Then("User see a {string} shirt")
	public void user_see_a_shirt(String string) {
	WebElement resultproduct = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"));
	
	}

}
