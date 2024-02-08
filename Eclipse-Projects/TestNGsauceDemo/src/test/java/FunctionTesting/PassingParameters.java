package FunctionTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
	
	WebDriver driver;
	
	
	

	@Parameters({"drivername", "url"})  //Passing parameters through test-output folder -- .xml file --(PassingParameter.xml)
	@Test
	void setupDriver (String drivername, String url) { 
		
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
	
	
	
	
	
}
