package OOPS_DMV;

public class Empoyees {

	String name ;
	String phoneNumber;
	String Email; 
	private String SSN ;
	
	
	
	
	public Empoyees(String name, String phoneNumber, String email, String SSN) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.Email = email;
		this.SSN = SSN;
	}




	void greetings () {
		System.out.println("My name is: " + this.name);
		System.out.println("My phone Number is: " + this.phoneNumber);
		System.out.println("My Email Address is: " + this.Email);
		
		
	} 
	void permit (String name, int age, String address, String sex, int examScore) {
		
		NewCustomers nc = new NewCustomers(name, age, address, sex, examScore);
		nc.introductions();
		nc.permitExam();
	}
}
