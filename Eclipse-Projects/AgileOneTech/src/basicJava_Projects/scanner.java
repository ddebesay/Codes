package basicJava_Projects;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("Enter Ticket");
		Scanner sc = new Scanner(System.in);    // how to call the scanner
		int	num	= sc.nextInt();					// how to call and insert the number you want, works the same with TEXT, change to String 
		
		
		if (num <= 10 ) {
			System.out.println("low tier ");
		}
		
		else if (num > 10 && num <= 20) {
			System.out.println(" med tier");
		}
		
		else if (num > 20 && num <= 30) {
			System.out.println("High tier");
			
		}
		
		else {
			System.out.println(" NONE FOUND ");
		}
	}

}
