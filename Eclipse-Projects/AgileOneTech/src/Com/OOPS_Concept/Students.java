package Com.OOPS_Concept;

public class Students {

	// PROPERTIES

	String name;
	int age;
	boolean isResident;
	String course;
	int paymentMade = 3500;

	public Students(String name, int age, boolean isResident, String course, int paymentMade) { // Construct
		this.name = name;
		this.age = age;
		this.isResident = isResident;
		this.course = course;
		this.paymentMade = paymentMade;
	}

	// METHODS
	void introduce() {
		System.out.println("My name is: " + this.name);
		System.out.println("My age is: " + this.age);
		System.out.println("My course is: " + this.course);

		if (this.isResident == true) {
			System.out.println(this.name + " is a Citizen");
		} else {
			System.out.println(this.name + " is not a Citizen");
		}
		System.out.println(".....  ");

	}

	void regStatus() {
		System.out.println(this.name + " is entrolled in " + this.course);

		if (paymentMade <= 3500) {
			int remaining = 3500 - paymentMade;
			System.out.println(this.name + " Need to make a payment of: $" + remaining);
		}

		else {
			int overpaid = 3500 - paymentMade;
			System.out.println(this.name + " over paid. The Return is: $" + overpaid);
		}

		System.out.println("----------------------------------------------");

	}
}
