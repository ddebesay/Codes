package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageObject {
	
	@FindBy(xpath = "//button[normalize-space()='Open Menu']")
	WebElement selectButton;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutButton;
	
	WebDriver driver;

	public LogoutPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectButton () throws InterruptedException {
		selectButton.click();
		Thread.sleep(2000);
	}
	public void logoutButton () {
		logoutButton.click();
	}
	public void Logoutpage () throws InterruptedException {
		LogoutPageObject LO = new LogoutPageObject (driver);
		LO.selectButton();
		Thread.sleep(3000);
		LO.logoutButton();
	}
}
