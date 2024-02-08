package OOPS_Agile;

public class Employees {

  //Properties for EMP	
	String name; 
	String position;
	
	
	
	
	
	public Employees(String name, String position) {
		this.name = name;
		this.position = position;
	} 
	
	
	//METHODS for EMP
	
	void doRegistration (String name, int age, boolean status, String course, int payment) {
	
		Students student = new Students(name, age, status, course, payment);
		student.introduce();
		student.regStatus();
	}
	
	
	void hireInstructor (String name, String email, String Hiredate, int review) {
		Teachers teacher = new Teachers(name, email, Hiredate, review);
		teacher.intro();
		teacher.InstructorReview();
		
		
	} 	
	
	}

