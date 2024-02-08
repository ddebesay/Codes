package PageObjectModels;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductPage {
	
	@FindBy(xpath = "//div[@class='product_label']")
	WebElement pageTitle;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement sortProducts;
	@FindBy(xpath = "(//button[contains(text(),'ADD TO CART')])[1]")
	WebElement addProducttoCart;
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPageTitle (String ExpectedTitle) {
	String ActualTitle = pageTitle.getText();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);  // Will be used mored in cucumber
	/*
		 if (ActualTitle.equals(ExpectedTitle)) {
			 System.out.println("Products Page Title Pass");
		 }
		 else {System.out.println("Product Page Title did not Pass");
		 }
	*/	 
	}
	public void checkProductCount () {  //pass
		WebElement	parentproducts = driver.findElement(By.xpath("//div[@class='inventory_list']"));
		List<WebElement>childElements = parentproducts.findElements(By.xpath("//div[@class='inventory_item']"));
		System.out.println("There Are " + childElements.size()+" Products in Homepage");	
	}
	public void SelectnameSort () throws InterruptedException {
		Thread.sleep(2000);
		Select sc = new Select(sortProducts);
		sc.selectByVisibleText("Price (low to high)");	
		Thread.sleep(3000);
		sc.selectByVisibleText("Name (Z to A)");	
		Thread.sleep(3000);
		sc.selectByVisibleText("Name (A to Z)");
		Thread.sleep(3000);
		sc.selectByVisibleText("Price (high to low)");
	}
	
	public void LowtoHighSorting () throws InterruptedException {
		Select sc = new Select(sortProducts);
		sc.selectByVisibleText("Price (low to high)");	
		Thread.sleep(3000);
	}
	
	public void addProducttoCart () throws InterruptedException {
		Thread.sleep(2000);
		addProducttoCart.click();
	}
	public void successfulHomePage (String PageTitle) throws InterruptedException {
		ProductPage PP = new ProductPage (driver);
		PP.verifyPageTitle(PageTitle);
		PP.checkProductCount();  
		PP.SelectnameSort();	 
		PP.addProducttoCart();
	}
}
	