package SauceDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAndLogout {
	WebDriver driver;
	
	@Test (alwaysRun = true, priority = 1, groups = {"smoke","regression"})
	void setupDriver () {       
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	// Login test with correct credentials 
	@Test (priority = 2, groups = "smoke")
	void loginTestCorrectCredentials () {
		 WebElement	UsernameField =driver.findElement(By.xpath("//input[@id='user-name']"));
		 UsernameField.sendKeys("standard_user");
		 
		 WebElement	PasswordField =driver.findElement(By.xpath("//input[@id='password']"));
		 PasswordField.sendKeys("secret_sauce");
		 
		 WebElement	LoginButton =driver.findElement(By.xpath("//input[@id='login-button']"));
		 LoginButton.click(); 
	}
	
	// login test with wrong credentials 
	@Test (enabled = false)
	void loginTestWrongCredentials () {
		WebElement	UsernameField =driver.findElement(By.xpath("//input[@id='user-name']"));
		UsernameField.sendKeys("locked_out_user");
 
		WebElement	PasswordField =driver.findElement(By.xpath("//input[@id='password']"));
		PasswordField.sendKeys("secret_sauce");
 
		WebElement	LoginButton =driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginButton.click();
	}
			
	// logout test 
	@Test (priority = 3, groups = "smoke")
	void logOut () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		}
	
	@Test (priority = 4, groups = {"smoke" , "regression" })
	void closeDriver () throws InterruptedException {
	Thread.sleep(2000);
	driver.close();
	driver.quit();
} 
}
