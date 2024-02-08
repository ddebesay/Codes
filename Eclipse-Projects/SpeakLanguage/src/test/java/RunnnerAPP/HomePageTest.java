package RunnnerAPP;

import org.openqa.selenium.WebDriver;

import PageObjectModels.HomePage;
import PageObjectModels.base;

public class HomePageTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = base.getdriver();
		
		HomePage HP = new HomePage (driver);
		HP.SpeakLanguagesClickable();
		HP.SpeakLanguageLogoDisplay();
		HP.LoginButtonDisplay();
		HP.SignUpButtonDisplay();
		HP.SearchboxinputDisplay();
		HP.SearchboxButtonDisplay();	
		HP.SearchingWithValidData();
		driver.navigate().back();
		HP.SearchingWithInvalidData();
		driver.navigate().back();
		HP.DifferentLanguagesLinks();
		
			
		System.out.println("HomePage Test Compete!!");

	}

}
