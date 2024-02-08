package InheritanceAndOveride;

public class Singer extends Human{   // Singer is acting as child and receiving the extend from parent
	
	
	public Singer(String name) {
		super(name);
		
	}
	void singASong () {
		System.out.println(super.name + " is singing All Of Me");
	}
	
	
}
