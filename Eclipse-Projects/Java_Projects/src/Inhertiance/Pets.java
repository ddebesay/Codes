package Inhertiance;

public class Pets {
	
	String name;
	int age;
	
	public Pets(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
		void eat () {
			System.out.println(this.name + " Love eating");
		}
}
