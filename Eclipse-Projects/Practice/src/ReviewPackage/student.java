package ReviewPackage;


public class student {  // bluePrint
	
	public String name;
	private  String SSN = "001"; 
	String Address= "123 Wilson BLVD";
	

	
	public student(String name) {
		this.name = name;
	}



	public void Status () {
		System.out.println("My name is " + this.name + " My SSN is " + this.SSN + " my Address is " + this.Address);
		System.out.println(this.SSN);
	}
	 
}
