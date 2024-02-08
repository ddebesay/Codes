package NestedCondition;

import java.util.Scanner;

public class UserCheck {

	public static void main(String[] args) {
		/*
		 * actual database Username and Password
		 * With Scanner User will provide a user and password
		 * if the Username matches with databse username, then it will ask for password
		 * else it will say "Username does not exist" 
		 * 
		 * if the password matches then it will say "Welcome to Java 101"
		 * else the password does not match sorry can't give access
		 */

		
		
		String databaseUsername = "jon@admin.com";
		String databasepassword = "password101";
		Scanner sc = new Scanner(System.in);
		
		//User will provide the username
		System.out.println("Enter Username: ___");
		String actualUsername = sc.nextLine();
		
		if (actualUsername.equals(databaseUsername)) {
			
			System.out.println("Enter Password");
			String acutalpassword = sc.nextLine();
			
			if (acutalpassword.equals(databasepassword)) {
				System.out.println("Welcome to Java 101");
			} 
			else {
				System.out.println("Password does not match");
				System.out.println("Rset Password");
			}
		} 
		else {
			System.out.println("Sorry username does not exist");
		}
		
		
	}

}
