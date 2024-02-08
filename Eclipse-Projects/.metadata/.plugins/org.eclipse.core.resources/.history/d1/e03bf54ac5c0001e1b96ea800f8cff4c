package RunnnerAPP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.speaklanguages.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("ddebesay@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_input']")).sendKeys("Danny@1995");
		driver.findElement(By.xpath("//input[@id='login_button']")).click();
		
		Thread.sleep(5);
	String UserNameVerification	= driver.findElement(By.xpath("//li[@id='nav_user']//a[normalize-space()='daniel']")).getText();
		
	
		
	System.out.println(UserNameVerification);
	
	Thread.sleep(10);
	driver.quit();
	}

}
