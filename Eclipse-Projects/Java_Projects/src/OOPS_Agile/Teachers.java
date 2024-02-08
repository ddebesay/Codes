package OOPS_Agile;

public class Teachers {


	String name;
	String email;
	String Hiredate;
	int review;

	public Teachers(String name, String email, String Hiredate, int review) {

		this.name = name;
		this.email = email;
		this.Hiredate = Hiredate;
		this.review = review;

	}

	
	void intro() {
		System.out.println("My name is: " + this.name);
		System.out.println("My email address is: " + this.email);
		System.out.println("My Hire Date is: " + Hiredate);

		System.out.println("....");
	}

	void InstructorReview() {

		System.out.println(this.name + " Review Below:");

		if (this.review <= 5) {
			System.out.println(this.name + " is not a good Teacher ");

		} else if (this.review > 5 && this.review <= 7) {
			System.out.println(this.name + " is a okay Teacher ");
		} else {
			System.out.println(this.name + " is a great Teacher");
		}
		System.out.println("--------------------------------------------------");
	}
}