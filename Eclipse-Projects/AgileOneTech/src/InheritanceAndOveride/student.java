package InheritanceAndOveride;

public class student extends Human {  // how you extend to Human (parent) class 


	public student(String name) {  
		super(name);      // you need to call Contract with Super in it. 
	}

	void career () {
		System.out.println(super.name + " is majoring in Engineering ");
	}

	@Override  // example of child class override parent class .. right click + source + (override/imp method) 
	void drink() {
		System.out.println(super.name + "'s my favorite dring is Pepsi");
	}	
	
}
