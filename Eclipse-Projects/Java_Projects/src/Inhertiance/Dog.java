package Inhertiance;

public class Dog extends Pets{

	public Dog(String name, int age) {
		super(name, age);
	
	}
	
	@Override
	void eat () {
		System.out.println(super.name + " only eat RAW meat");
	}
	

}
