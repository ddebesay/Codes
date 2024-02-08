package PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
	
	public static WebDriver getDriver () {
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			return driver;
	}
	public static void takeScreenshot (String filename) throws IOException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		File screenshotFile	= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File (filename +".png"));
		
		
	}
}