package PageObjectModels;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	@FindBy (xpath = "//div[@id='logo']/a")
	WebElement SpeakLanguagesClickable;
	@FindBy(xpath = "//p[@class='large_text']//img[@alt='Speak Languages']")
	WebElement SpeakLanguageLogoDisplay;
	@FindBy(xpath = "//li[@id='nav_login']")  //a[.='Log in']
	WebElement LoginButtonDisplay;
	@FindBy(xpath = "//li[@id='nav_signup']")
	WebElement SignUpButtonDisplay;
	@FindBy (xpath = "//input[@name='q']")
	WebElement Searchboxinput;
	@FindBy (xpath = "//input[@type='submit']")
	WebElement SearchboxButton;
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SpeakLanguagesClickable () throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String clickableLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		SpeakLanguagesClickable.sendKeys(clickableLink);	
		Thread.sleep(5000);
		String AuctualTitlePage = driver.getTitle();
		String ExpectedTitle = "Speak Languages — Learn a new language online";
		if (AuctualTitlePage.equals(AuctualTitlePage)) {
			System.out.println("SpeakLanguages Clickable Logo Match with Actual Link");
		}
		else {
			System.out.println("fail");
		}
	}
	
	public void SpeakLanguageLogoDisplay ()   {
		if (SpeakLanguageLogoDisplay.isDisplayed()) {
			System.out.println("Logo is Displaying");
		}
		else {
			System.out.println("Logo is not Displaying");
		}
	}
	public void LoginButtonDisplay ()  {
		if (LoginButtonDisplay.isDisplayed()) {
			System.out.println("Login Button is Displaying");
		}
		else {
			System.out.println("Login Button is not Displaying");
		}
	}
	public void SignUpButtonDisplay ()  {
		if (SignUpButtonDisplay.isDisplayed()) {
			System.out.println("SignUp Button is Displaying");
		}
		else {
			System.out.println("SignUp Button is not Displaying");
		}
	}
	public void SearchboxinputDisplay ()  {
		if (Searchboxinput.isDisplayed()) {
			System.out.println("Search box input is Displaying");
		}
		else {
			System.out.println("Search box input is not Displaying");
		}
	}
	public void SearchboxButtonDisplay () {
		if (SearchboxButton.isDisplayed()) {
			System.out.println("Search box Button is Displaying");
		}
		else {
			System.out.println("Search box Button is not Displaying");
		}
}
	public void SearchingWithValidData () {
		Searchboxinput.sendKeys("English");
		SearchboxButton.click();
		String ActualResult = driver.findElement(By.xpath("//div[@class='er_search_results_count']")).getText();
		String ExpectedResults = "Showing 352 results for \"english\"";
		
		if (ActualResult.equals(ExpectedResults)) {
			System.out.println("Search Box & Button is Entering Correct Data & recieving Correct Data");
		}
		else {
			System.out.println("Search Box & Button is Not Working");
		}
		
	}
	public void SearchingWithInvalidData () throws InterruptedException {
		Thread.sleep(2);
		Searchboxinput.sendKeys("fsnkifms");
		SearchboxButton.click();
	
	String ActualResult = driver.findElement(By.xpath("//h3[@aria-label='No results']")).getText();
	String ExpectedResult = "No results found";
	
	if (ActualResult.equals(ExpectedResult)) {
		System.out.println("Pass: No results Founds");
	}
	else {
		System.out.println("N/A");
	}
		
	}
	
	public void DifferentLanguagesLinks () throws InterruptedException {
		
		List<WebElement> LanguageElements = driver.findElements(By.xpath("//p[@class='site_link']//a"));

		List<String> LanguageUrls = new ArrayList<String>();
		for (WebElement element : LanguageElements ) {
			String langUrls = element.getAttribute("href");
			LanguageUrls.add(langUrls);
		}
		String parentWindow = driver.getWindowHandle();
		for (String link : LanguageUrls ) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(link);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentWindow);

	}
}	
}