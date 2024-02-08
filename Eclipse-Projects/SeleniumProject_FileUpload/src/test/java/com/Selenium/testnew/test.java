package com.Selenium.testnew;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.out.println("Enter URL");
		Scanner sc = new Scanner(System.in);
		String URL = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

	}

}
