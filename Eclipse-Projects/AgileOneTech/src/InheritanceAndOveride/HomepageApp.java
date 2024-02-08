package InheritanceAndOveride;

public class HomepageApp {
	
// Inheritance: mainly USED to reduce the line of coding. Create a class and extend to other classes
// Override: authorizing to reject or cancel; child class can override a method and change  
// Overloading: you can add parameters in child class that are being inherited by parent class 
	public static void main(String[] args) {

		
		student bobby = new student("bobby");
		Doctor james = new Doctor("James");
		Singer John = new Singer("John Legand");
/*
		
		bobby.eat(); // as you can see, RF from STUDENT class can call from human (Super: AKA; Supervisor) class. that way we can organize our coding. 
		james.drink(); // as you can see, RF from DOCTOR class can call from human (Super: AKA; Supervisor) class. 
		John.drink();// as you can see, RF from SINGER class can call from human (Super: AKA; Supervisor) class. 
		
*/		
		
		
		bobby.drink();  // Example of Override, bobby did not like Vitamin Water so we @override  
		
		
		
		//OverLoading Example
		
		james.drink(5);  // i added parameters into inheritance. thats called overloading.  
	}
					
}
