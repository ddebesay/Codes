package OPPS_Hospital;

public class Patients {

	String name;
	String address;
	String phone;
	boolean Checkout;
	int bills;

	public Patients(String name, String address, String phone, boolean checkout, int bills) {

		this.name = name;
		this.address = address;
		this.phone = phone;
		this.Checkout = checkout;
		this.bills = bills;
	}

	void greetings() {
		System.out.println("My name is: " + this.name);
		System.out.println("My address is: " + this.address);
		System.out.println("My phone number is:" + this.phone);
		System.out.println(".............");

	}

	void payment() {

		if (bills < 15000) {
			int remaining = 15000 - bills;
			System.out.println(this.name + " need to make a paymment of: $" + remaining);

		} else {
			int overpaid = 15000 - bills;
			System.out.println(this.name + "has over paid. The return is: $" + overpaid);
		}
	}

	void checkout() {

		if (this.Checkout == true) {
			System.out.println(this.name + " has Checked out.");
		} else {
			System.out.println(this.name + " has not checked out");
		}
		System.out.println("-----------------------------------------------------------------");
	}
}
