package PolyMorphismAndAbstractPractice;

public class Students {
		String name; 
		int age;
		String SSN;
		
		public Students(String name, int age, String SSN) {
			this.name = name;
			this.age = age;
		} 
		
		void showInfo ( ) {
			System.out.println("Name: " + this.name);
			System.out.println("Age: " + this.age);
		}
		

		public String getSSN() {
			String ssnnumber = "154-24-0144";
			return ssnnumber;
		}

		public void setSSN(String sSN) {
			SSN = sSN;
		} 
}
