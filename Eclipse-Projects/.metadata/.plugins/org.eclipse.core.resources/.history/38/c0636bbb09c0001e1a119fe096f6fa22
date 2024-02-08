package RunnnerAPP;

import org.openqa.selenium.WebDriver;

import PageObjectModels.SignUpPage;
import PageObjectModels.base;

public class Smoke {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = base.getdriver();
		
		SignUpPage SP = new SignUpPage (driver); 
		SP.SignUpButton();
		SP.FirstNameField();
		SP.LastNameField();
		SP.EmailAddressField();
		SP.PasswordField();
		SP.SelectSexBox();
		SP.DateOfBirth();
		SP.SignupButtonOnReg();
		
		SP.SignUpVerification();
	}

}
