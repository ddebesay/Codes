package FunctionTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FrameWork_AnnotationsXParameters {
	
WebDriver driver;
	
	
	
	@BeforeTest												//Annotation to run before Class 
	@Parameters({"drivername", "url"})						//Passing parameters through test-output folder -- .xml file 
	void setupDriver (String drivername, String url) { 
		System.out.println("Driver lanuch before Test");
		if (drivername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver ();	
		}
		else if (drivername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();  
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get(url);	
	}
	
	@BeforeClass
	void login () {
		System.out.println("Login lanuch before class");
		WebElement	UsernameField =driver.findElement(By.xpath("//input[@id='user-name']"));
		 UsernameField.sendKeys("standard_user");
		 
		 WebElement	PasswordField =driver.findElement(By.xpath("//input[@id='password']"));
		 PasswordField.sendKeys("secret_sauce");
		 
		 WebElement	LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		 LoginButton.click(); 
	}
	
	@Test
	void titleTest () {
	String productTitle = driver.findElement(By.xpath("//div[@class='product_label']")).getText();
	
			if (productTitle.equals("Products")) {
				System.out.println("Login is Successful");
			} 
			else {
				System.out.println("Login is fail");
			}
	}
}
