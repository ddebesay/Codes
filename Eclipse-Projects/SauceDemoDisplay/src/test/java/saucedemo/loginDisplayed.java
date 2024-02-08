package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginDisplayed {
	
	@FindBy(xpath = "//img[@class='bot_column']")
	WebElement Logo;
	@FindBy(xpath = "//input[@id='password']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Password;
	
	WebDriver driver;

	public loginDisplayed(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titlePage (String EnterTitle) { 
		String LoginTitlePage = driver.getTitle();
		
		if (LoginTitlePage.equals(EnterTitle)) {
			System.out.println("LoginPage: Title Passed");
		}
		else {
			System.out.println("LoginPage: Title failed");
		}					
	}

	public void Logodisplayed () {
		
		if (Logo.isDisplayed()) {
			System.out.println("LoginPage: Logo is display");
		}
		else {
			System.out.println("LoginPage: Logo is not displaying");
		} 
		
	}
	
	public void usernameDisplayed () {
		if (Username.isDisplayed()) {
			System.out.println("Username: is Display");
		}
		else {
			System.out.println("Username: is not Displaying");
		}
	}
	
	public void passwordDisplayed () {
		if (Password.isDisplayed()) {
			System.out.println("Password: is Display");
		}
		else {
			System.out.println("Password: is not Displaying");
		}
	}









}
