package TestNGFrameWork;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver () throws FileNotFoundException, IOException {
			
			prop = new Properties();
			prop.load(new FileInputStream("src/main/resources/config.properties"));
			
		String browserName = prop.getProperty("browsername");
		String baseURL = prop.getProperty("baseURL");
		
		
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver ();
			} 
			else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			else {
					System.out.println("NA");
			}
			
			driver.manage().window().maximize();
			driver.get(baseURL);
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
