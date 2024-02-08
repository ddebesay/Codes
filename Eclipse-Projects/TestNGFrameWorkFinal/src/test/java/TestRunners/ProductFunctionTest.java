package TestRunners;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;

import TestNGFrameWork.Base;

public class ProductFunctionTest extends BaseTest{
	
	
	@Test (priority = 1, groups = {"regression"})
	public void CheckProductPageDashBoard () throws FileNotFoundException, IOException   {
		pp.verifyPageTitle("Products");
		Base.takeScreenshot("Product Page");
		
	}
	@Test (priority = 2, groups = {"regression"})
	public void checkProductSorting () throws InterruptedException {
		pp.SelectnameSort();
	}
	@Test (priority = 3, groups = "smoke")
	public void addproductToCart () throws InterruptedException {
		pp.addProducttoCart();
	}
	
}
