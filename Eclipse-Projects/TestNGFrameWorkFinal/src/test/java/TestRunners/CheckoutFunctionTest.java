package TestRunners;

import java.time.Duration;

import org.testng.annotations.Test;

public class CheckoutFunctionTest extends BaseTest {
	
	
	@Test(priority = 1, groups = {"regression", "smoke"})
	void completeCheckoutProcess () throws InterruptedException {
		pp.addProducttoCart();
		Thread.sleep(Duration.ofSeconds(2));
		cp.AddtoCartAndCheckoutButton();
	}
	@Test (priority = 2, groups = {"regression", "smoke"})
	void filloutForm () throws InterruptedException {
		cop.firstnameField("jon");
		cop.lastnameField("smith");
		cop.postalCodeField("2522");
		Thread.sleep(Duration.ofSeconds(2));
		cop.continueButton();
		Thread.sleep(Duration.ofSeconds(2));
		cop.finishButton();
	}
}
