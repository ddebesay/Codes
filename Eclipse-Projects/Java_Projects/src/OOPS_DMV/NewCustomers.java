package OOPS_DMV;

public class NewCustomers {
	
	
	String name;
	int age;
	String address;
	String sex; 
	int examScore;
	
	
	public NewCustomers(String name, int age, String address, String sex, int examScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.sex = sex;
		this.examScore = examScore;
	}


	void introductions () {
		
		System.out.println("My name is: " + this.name);
		System.out.println("My age is: " + this.age);
		System.out.println("My address is: " + this.address);
		System.out.println("I am a " + this.sex);
		System.out.println(".....");
	}
	
	void permitExam () {
	 
		if (examScore < 45){
			
			double result = ( double)examScore / 50;
			System.out.println("Sorry you have failed the exam. Your score is: "+ result + "%. you need 90% to pass. Please retake the exam after 90 days" );	
		}
		else {
			double result = (double) examScore / 50;
			System.out.println("CONGRATULATION!! you have passed. Your score is: " + result +"%");
		}
			System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
	
}
