package FunctionTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderXmultiArray {
		
	
	@Test (dataProvider = "loginData")						//dataProvider name need to match inorder to recieve the data
	void login (String username, String password) {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement	UsernameField =driver.findElement(By.xpath("//input[@id='user-name']"));
		UsernameField.sendKeys(username);
		 
		WebElement	PasswordField =driver.findElement(By.xpath("//input[@id='password']"));
		PasswordField.sendKeys(password);
		 
		WebElement	LoginButton =driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginButton.click(); 
		} 
	
	@DataProvider(name = "loginData")			// in-order dataprovider to work, you need to call it, it takes String name  
	 Object[][] DataProvider () {   			//Since its is retruning object, it needs to be object instead of void
	Object [][]	data = { {"standard_user","secret_sauce"}, {"locked_out_user","secret_sauce"}, {"problem_user","secret_sauce"} };   //this is an object primitive
	
	return data;
	} 
}
