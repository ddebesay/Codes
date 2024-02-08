package AppRunner;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver (); 
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.speaklanguages.com");
		
		Thread.sleep(2000);
		List<WebElement> LanguageElements = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		
		List<String> LanguageUrls = new ArrayList<String>();
		
		for (WebElement element : LanguageElements ) {
			String langUrls = element.getAttribute("href");
			LanguageUrls.add(langUrls);
		}
		String parentWindow = driver.getWindowHandle();
		for (String link : LanguageUrls ) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(link);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentWindow);
	}

}
}
