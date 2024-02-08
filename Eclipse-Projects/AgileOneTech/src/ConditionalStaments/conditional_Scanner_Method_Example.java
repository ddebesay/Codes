package ConditionalStaments;

import java.util.Scanner;

public class conditional_Scanner_Method_Example {

	public static void main(String[] args) {
		
		conditional_Scanner_Method_Example PT = new conditional_Scanner_Method_Example ();				// calling methods 
		Scanner sc = new Scanner(System.in);				// calling scanner/ input 
		int num = sc.nextInt();								// calling the scanner with int		
		
		
		PT.num(5);											// calling the methods... PT --> callimg method from main method; .num ---> method created outside class. 
	
	}

	
	
	void num (int x) {
			
		if (x == 10) {
			System.out.println("TEST");
		}
		else {
			System.out.println("NA");
		}


}
}