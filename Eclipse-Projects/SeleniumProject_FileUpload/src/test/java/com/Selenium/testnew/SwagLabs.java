package com.Selenium.testnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   //starting the webdriver
		driver.manage().window().maximize();     // maximuize the window
		driver.get("https://www.saucedemo.com/v1/index.html");  // got the this URL
		driver.findElement(By.name("user-name")).sendKeys("standard_user");   //Enter USername
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 	 // Enter password 		
		driver.findElement(By.className("btn_action")).click();				//Click log in button
		
		
		
		//Checklist 1 verifiy product 
		String productTitle = driver.findElement(By.xpath("//div[@class='product_label']")).getText();
		
		System.out.println(productTitle);
		
		
		
		WebElement selectField = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select sc = new Select(selectField);
		sc.selectByVisibleText("Name (Z to A)");
		
		
	}

}
