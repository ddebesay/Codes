package Inhertiance;

public class TestApp {

	public static void main(String[] args) {
		
		Dog dog = new Dog("roy", 4);
		dog.eat();
		
		Cat cat = new Cat("Lilly", 2);
		cat.eat("Castco", 5, 8);
	}

}
