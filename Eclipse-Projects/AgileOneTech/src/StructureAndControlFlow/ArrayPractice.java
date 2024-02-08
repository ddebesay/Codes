package StructureAndControlFlow;

public class ArrayPractice {

	public static void main(String[] args) {
					
			//1st ways to set up Array
		int[] numbers = { 10, 20, 30, 40, 50, 60 }; 	// Array integer

		//	System.out.println(numbers[0]); 			// how to print Array, Note start from 0 
		
		//	System.out.println(numbers.length);
		
		
		String [] cars = {"Toyota", "Nissan", "Honda", "BMW"};
		//	System.out.println(cars.length);
		
		
		// 2nd way to set up Arrays
		int [] num = new int [3];     // Only issues is that when you assign Array - you can not set up more than 4 num, other wise it will error 
		num [0] = 10;
		num [1] = 20;
		num [2] = 30;
	//	num [3] = 40;
	
		//System.out.println(num[0]);
		
		String [] name = new String [3];
		name [0] = "bob";
		name [1] = "king";
		name [2] = "Joe";
		
		
		

	}

}
