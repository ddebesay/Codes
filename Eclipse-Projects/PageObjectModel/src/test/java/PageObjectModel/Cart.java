package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	@FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']")
	WebElement clickShopingCart;
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement CheckoutButton;

	WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickShopingCart () throws InterruptedException {
		clickShopingCart.click();
		Thread.sleep(2000);
	}
	public void CheckoutButton () {
		CheckoutButton.click();
	}
	public void AddtoCart () throws InterruptedException {
		Cart ct = new Cart (driver);
		ct.clickShopingCart();
		ct.CheckoutButton();
	}
}
