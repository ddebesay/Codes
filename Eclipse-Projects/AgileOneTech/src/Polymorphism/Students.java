package Polymorphism;

public class Students {
	String name; 
	
	
	public Students(String name) {
		this.name = name;
	}


	public void Travel (String destination, Transport trans) {
		System.out.println(this.name + " Is traveling to " + destination + " By " + trans.name);
	}
	

}