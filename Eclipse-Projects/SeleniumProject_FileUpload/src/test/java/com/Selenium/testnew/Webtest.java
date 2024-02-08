package com.Selenium.testnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtest {

	public static void main(String[] args) {
		
		//how to navigate Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		System.out.println(driver.getTitle().toUpperCase());
		driver.quit();
		
		
		// 1 navigation .. go to URL, go back , refresh, go forward 
				//80% used to automate
		// To read something --- .getText();
		// To write something--- .sendKeys();
		//to Click something --- .click();
	
		
		
	}

}
