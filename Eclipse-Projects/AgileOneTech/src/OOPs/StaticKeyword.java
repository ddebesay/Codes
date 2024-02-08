package OOPs;

public class StaticKeyword {						 // Public class is nor static meaning worldwide
	
	static int NumOne = 5; 						// NOTE:: WE do no need to create a method () in order to print in main method, the main method is static. 
	static int NumTwo = 2;										// You can also  change this into static, since the main method is static 	
// {
	//	System.out.println("01 this is fast");     // STATIC : A block a code that will be executed before the main method 
//	}
	
	
	public static void main(String[] args) {			// ****STATIC*******
	//	printpage(); 									// this is how you can call static 				
		
		add();
		sub();
		
		
		
		
		
		}
	
//	static void printpage () {							//NOTE:: WE do no need to create a method () in order to print in main method. we can from method to Static. 
//		System.out.println("IS this Printing?");
//	}
	
	 static void add () {									// Change into static 							
		int res = NumOne + NumTwo;
		System.out.println(res);
		
	}
	static void sub () {
		int res = NumTwo - NumOne;
		System.out.println(res);
	}
//	static {
	//	System.out.println("02 this is fast");      // As you can see this  Static beat the main page, however it will print the first static written in the class   
//	}
}
