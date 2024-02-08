package FunctionTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	void beforeTest () {
		System.out.println("I am a Test that print Before all test");
	}
	
	@AfterTest
	void afterTest () {
		System.out.println("I am a Test that print After all test");
	}

	@BeforeClass
	void beforeClass () {
		System.out.println("I am a Class that print before all Class");
	} 
	
	@AfterClass
	void afterClass () {
		System.out.println("I am a Class that print before all Class");
	}
	
	
	@BeforeMethod 		// this method will print BEFORE all methods
	void beforeMethod() {
		System.out.println("I am a Method that print before all methods");
	} 
	
	@AfterMethod		// this method will print AFTER all methods
	void afterMethod() {
		System.out.println("I am a Method that print After all methods");
	} 
	@Test
	void testOne() {
		System.out.println("Test1");
	} 
	@Test
	void testTwo() {
		System.out.println("Test2");
	}
	@Test
	void testThree() {
		System.out.println("Test3");
	}
	
	
	
}
