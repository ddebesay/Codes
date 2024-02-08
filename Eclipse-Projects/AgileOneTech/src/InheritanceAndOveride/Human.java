package InheritanceAndOveride;

public class Human {  // Human class is acting as parent and extending to other classes
	String name; 
	
	
	

	public Human(String name) {
		this.name = name;		//whereas the parent can stay as this.name
	}

	void eat () {   // Since this is extend, Student, Doctor, Singer class can access this methods
		System.out.println(this.name + "'s favorite food is Pizza");
	}
	
	void drink() {
		System.out.println(this.name + "'s favorite drink is Vitamin Water");
	}
}
