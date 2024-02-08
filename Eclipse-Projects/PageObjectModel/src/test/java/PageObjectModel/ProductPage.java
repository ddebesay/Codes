package PageObjectModel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	@FindBy(xpath = "//div[@class='product_label']")
	WebElement pageTitle;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement sortProducts;
	@FindBy(xpath = "(//button[contains(text(),'ADD TO CART')])[1]")
	WebElement addtoCart;
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPageTitle () {
	String pageTitleofProducts = pageTitle.getText();
		 if (pageTitleofProducts.equals("Products")) {
			 System.out.println("Products Page Title Pass");
		 }
		 else {System.out.println("Product Page Title did not Pass");
		 }
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
	public void addtoCart () throws InterruptedException {
		Thread.sleep(2000);
		addtoCart.click();
	}
	public void successfulHomePage () throws InterruptedException {
		ProductPage PP = new ProductPage (driver);
		PP.verifyPageTitle();
		PP.checkProductCount();  
		PP.SelectnameSort();	 
		PP.addtoCart();
	}
}
	
	
	
	
	
	
	
	
	
	
