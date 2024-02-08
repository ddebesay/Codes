package PageObjectModels;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfoPage {
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstnameField;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastnameField;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postalCodeField;
	@FindBy(xpath = "//input[@class='btn_primary cart_button']")
	WebElement continueButton;
	@FindBy(xpath = "//a[@class='btn_action cart_button']")
	WebElement finishButton;

	WebDriver driver;

	public CheckOutInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void firstnameField (String EnterFirstName) {
		firstnameField.sendKeys(EnterFirstName);
	}
	public void lastnameField (String EnterLastName) {
		lastnameField.sendKeys(EnterLastName);
	}
	public void postalCodeField (String EnterPostalCode) {
		postalCodeField.sendKeys(EnterPostalCode);
	}
	public void continueButton () {
		continueButton.click();
	}
	public void finishButton () throws InterruptedException {
		Thread.sleep(3000);
		finishButton.click();
	}
	
	public void checkoutInfo (String FirstName, String LastName, String PostalCode) throws InterruptedException {
		CheckOutInfoPage COI = new CheckOutInfoPage(driver);
		COI.firstnameField(FirstName);
		COI.lastnameField(LastName);
		COI.postalCodeField(PostalCode);
		COI.continueButton();
		COI.finishButton();
	}
}
