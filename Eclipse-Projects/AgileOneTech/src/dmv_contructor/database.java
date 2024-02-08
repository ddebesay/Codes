package dmv_contructor;

public class database {
	
	String name = "null";  // Properies Objects where to store data NOTE: all data type 
	int age = 0;
	String sex = "null";
	String customerID = "null";
	boolean didYouPass = true; 
	
	
	
	
	
	
	
	public database(String name, int age, String sex, String customerID, boolean didYouPass) { //NOTE Contructor has the same name as the public class name
		
		this.name = name;   // Contructor --> (sft + alt + S) .. Contructor is WORK!! also pathways also our job easier; without creating new person iddentity in properities area 
		this.age = age;
		this.sex = sex;
		this.customerID = customerID;
		this.didYouPass = didYouPass;
		
	}	
		
		
		public void searchbox () {
			
			if (this.didYouPass == true) {
				System.out.println(this.name + " Congrats on passing the exam");
			}
			else {
				System.out.println("please reschedule your exam in 90 days");
			}
		}
	





	public void printoutpage () {
		System.out.println(" Your Name Is " + this.name);
		System.out.println((" Your Age Is " +this.age));
		System.out.println((" Your Sex Is " + this.sex));
		System.out.println((" Your Customer ID Is: " + this.customerID));
		System.out.println((" DID YOU PASS? " + this.didYouPass));
		System.out.println("---------------------------------------");
	}
	
	
}
