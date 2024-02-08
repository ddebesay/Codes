package InheritanceAndOveride;

public class Doctor extends Human {

	public Doctor(String name) {
		super(name);
	}

	void healthAdvice () {
		System.out.println(super.name + " gave adice regarding Health and fitness");
	}
	
	void drink(int bottleDrink) {  // Example of overloading. Simply copy form parent class and add parameters
		System.out.println(super.name + " drinks " + bottleDrink +" Vitamin Water bottle a day");
	}
}
