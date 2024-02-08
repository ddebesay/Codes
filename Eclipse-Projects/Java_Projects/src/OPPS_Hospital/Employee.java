package OPPS_Hospital;

public class Employee {
	String name; 
	String position;
	
	
	
	
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	} 
	
	
	void register (String name, String address, String phone, boolean Checkout, int bills) {
		Patients pat = new Patients(name, address, phone, false, 0);
		pat.greetings();
		pat.payment();
		pat.checkout();
		
		
	}
	
	
}
