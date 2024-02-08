package AccessModifiers_Encapsulation;

public class database {
	public	String name;    							 // Public: it was accessible to all classes
	private	String SSN = "571-02-0201" ;  				// it was not accessible to any other class but accessible inside this class
	protected String Address = "123 wison blvd";		// Defaults stays only within the same package
		
		
		public database(String name) {
		
			this.name = name;
			this.SSN = SSN;
			

		}

		private void printinfo () {
			System.out.println("Hello my name is " + this.name);
			System.out.println("My SSN is " + this.SSN);
		}

		public String getSSN() {		// can be used when class is private
			return SSN;
		}

		public void setSSN(String sSN) {		// change anything private, i change from SSN number 
			SSN = sSN;
		}

	
		
}
