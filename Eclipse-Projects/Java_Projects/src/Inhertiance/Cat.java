package Inhertiance;

public class Cat extends Pets{

	public Cat(String name, int age) {
		super(name, age);
		
	}
	
	void eat (String destination, int x, int y) {
		System.out.println(this.name + " likes to eat at " + destination + " " +  x + " times a day. Weekend, " + y + " times a day. :)");
	}
}
