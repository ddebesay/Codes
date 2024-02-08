package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {
	
		
		@FindBy(xpath = "//a[normalize-space()='Privacy policy']")
		WebElement PrivacyPolicy;
		@FindBy(xpath = "//a[normalize-space()='Terms of use']")
		WebElement TermsOfUse;
		@FindBy(xpath = "//a[normalize-space()='Contact us']")
		WebElement ContactUs;
		
		
		WebDriver driver;

		public FooterPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void PrivacyPolicy () {
			PrivacyPolicy.click();
			driver.navigate().back();
		}
		
		public void TermsOfUse () throws InterruptedException {
			Thread.sleep(1000);
			TermsOfUse.click();
			driver.navigate().back();
		}
		
		public void ContactUs () throws InterruptedException {
			Thread.sleep(1000);
			ContactUs.click();
			driver.navigate().back();
		}
		
		
}
