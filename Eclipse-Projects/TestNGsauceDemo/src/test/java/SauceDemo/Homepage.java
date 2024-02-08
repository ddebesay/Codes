package SauceDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Homepage {
	WebDriver driver;
	
	@Test (alwaysRun = true, priority = 1) 
	void driverSetUp () {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Assert.fail();
		} 
	@Test (priority = 2, groups = {"smoke" , "regression" })
	void checkTitlePage () {
		String titleofPage = driver.getTitle();
		
		if (titleofPage.equals("Swag Labs")) {
			System.out.println("Title is showing");
		} 
		else {
			System.out.println("Title is NOT showing");
		}
	} 
	
	@Test (priority = 3)
	void checkLogoApearance () {
		WebElement	logoApear = driver.findElement(By.xpath("//img[@class='bot_column']"));
		if (logoApear.isDisplayed()) {
			System.out.println("Logo is showing");
		} 
		else {
			System.out.println("Logo is NOT showing");
		}
	} 
	
	@Test (priority = 4)
	void usernameVerify () {
		WebElement	UsernameApear = driver.findElement(By.xpath("//input[@id='user-name']"));
		if (UsernameApear.isDisplayed()) {
			System.out.println("Username is showing");
		} 
		else {
			System.out.println("Username is NOT showing");
		}
	} 
	
	@Test (priority = 5)
	void passwordVerify () {
		WebElement	passwordApear = driver.findElement(By.xpath("//input[@id='password']"));
		if (passwordApear.isDisplayed()) {
			System.out.println("Password is showing");
		} 
		else {
			System.out.println("Password is NOT showing");
		}
	} 
	
	@Test (priority = 6)
	void loginButtonPresent () {
		WebElement	loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		if (loginButton.isDisplayed()) {
			System.out.println("LoginButton is showing");
		} 
		else {
			System.out.println("LoginButton is NOT showing");
		}
	}	
		@Test (priority = 7)
		void closeDriver () throws InterruptedException {
			driver.close();
			Thread.sleep(3000);
			driver.quit();
		} 
	} 
	
	
	
	