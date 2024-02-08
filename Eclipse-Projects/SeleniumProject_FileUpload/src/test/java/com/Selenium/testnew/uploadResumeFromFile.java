package com.Selenium.testnew;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class uploadResumeFromFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("http://agile1test.com/web/index.php/recruitmentApply/jobs.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting 5 sec until it throws expeptions 
		
		WebElement Apply = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary oxd-button']"));
		Apply.click();
		
		
		//Checkpoint 1 = passed	
		
		String ActualTitle = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")).getText();
		
		if (ActualTitle.equals("Apply for Career Support Manager")) {
			System.out.println("Happy");
		} 
		else {
			System.out.println("Sad");
		}
		
	

		//Fill in the Blanks  = passed
		
		WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstNameField.sendKeys("Jon");
		
		WebElement middleNameField = driver.findElement(By.xpath("//input[@name='middleName']"));
		middleNameField.sendKeys("fred");
		
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastNameField.sendKeys("Smith");
		
		WebElement emailAdressField = driver.findElement(By.xpath("//input[@name='email']"));
		emailAdressField.sendKeys("Jonsmith@gmail.com");
		
		WebElement contactNumberField = driver.findElement(By.xpath("//input[@name='contactNumber']"));
		contactNumberField.sendKeys("(703) 005-3025");
		
		
		//Resume Upload from File = passed
		
		File uploadFile = new File("C:\\Users\\ddebe\\Desktop\\Agile1Tech\\Automation\\ResumeSumitPractice\\Jon.resume.docx");   	// How to locate from file folder - Shift + right click copy - (Copy as Path)  
		WebElement fileInput = driver.findElement(By.xpath("//input[@name='resume']"));												// Find the Xpath where to upload the file in the browser 
		fileInput.sendKeys(uploadFile.getAbsolutePath());																			// file input and send keys. make sure to use absoulute path
		
		
		//Keywords = passed
		
		WebElement Keywords = driver.findElement(By.xpath("//input[@name='keywords']"));
		Keywords.sendKeys("Testing  Application. Verifying Keywords TextBox!!!");
		
		
		WebElement notes = driver.findElement(By.xpath("//textarea[@name='comment']"));
		notes.sendKeys("Testing Application. checking Notes text TextBox  !!!! ");
		
		
		// checkbox 
		
		WebElement checkBox = driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
		checkBox.click();
		
		
		//SummitButton 
		
		WebElement summitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		summitButton.click();
	
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
	}

}
