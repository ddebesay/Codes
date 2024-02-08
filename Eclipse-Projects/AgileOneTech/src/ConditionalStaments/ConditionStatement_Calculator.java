package ConditionalStaments;

import java.util.Scanner;

public class ConditionStatement_Calculator {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO OUR TAX CALCULATOR");
		
		Scanner sc = new Scanner(System.in);
		 int income		   = sc.nextInt();
		

		if (income <= 5000) {
			System.out.println("No tax");
		} 
		else if (income > 5000 && income <= 7000) {
			System.out.println("5% tax");

			double results = income * 0.05;
			System.out.println("Your income will be: " + results);

		} 
		else if (income > 7000 && income <= 9000) {
			System.out.println("7% tax");

			double results = income * 0.07;
			System.out.println("Your income will be: " + results);
		} 
		else {
			System.out.println("contact a tax officer");
		}
	}
}