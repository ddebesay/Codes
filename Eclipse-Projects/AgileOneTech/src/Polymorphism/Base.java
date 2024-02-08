package Polymorphism;

public class Base  {
	
	
	
	
	
public static void info () {
		
	
		Students jon = new Students("Jon");
		Students lee = new Students("Lee"); 
		Students rob = new Students("Rob");
		
		Transport trans = new Transport("Grey Hound");
		Transport trans2 = new Transport("AM Track");
		Transport trans3 = new Transport("Sprit Flight");
		
		jon.Travel("New York", trans);
		lee.Travel("Florida", trans2);	
		rob.Travel("Canada", trans3);
		
	}
}
