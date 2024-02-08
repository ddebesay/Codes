package PageObjectModels;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class  base{
	static 	WebDriver driver;
		
		public static WebDriver getdriver ( ) {
			
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.speaklanguages.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			return driver;
			
		
			
		}
		
		
		public static void ScrollFunction () throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
		}
		
		public static void TakeScreenshot (String fileName) throws IOException {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			File screenshotFile = 	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(screenshotFile, new File ("C:\\Users\\ddebe\\eclipse-workspace\\SpeakLanguage\\target\\ScreenShots" + fileName + ".png"));
		}
	}


