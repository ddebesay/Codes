package Polymorphism;

public class polymorphismTestApp {

	public static void main(String[] args) {
	
	/*
		//This is an old way of doing this. (Inheritance) create parent class, extends to child, pass parameters.  
		
		Students jon = new Students("Jon");
		Bus Greyhound = new Bus("Greyhound");
		jon.Travel("New York", Greyhound);
		
		
		Students lee = new Students("Lee");
		Train AMtrack = new Train("AM Track");
		lee.Travel("Florida", AMtrack);
		
		Students rob = new Students("Rob");
		Train sprint = new Train("Sprint");
		rob.Travel("Canada", sprint);
		
		
		//Polymorphism: when an objects takes different form of objects; Using Polymorphism below::
		// This is easier and cleaner. 
		// NOTE: you can assign child class with parameters of class name. Use the object to call in main method
		
		Students jon = new Students("Jon");
		Students lee = new Students("Lee"); 
		Students rob = new Students("Rob");
		
		Transport trans = new Transport("Grey Hound");
		Transport trans2 = new Transport("AM Track");
		Transport trans3 = new Transport("Sprit Flight");
		
		jon.Travel("New York", trans);
		lee.Travel("Florida", trans2);	
		rob.Travel("Canada", trans3);
*/
		
		Base.info();
		
	}

}
