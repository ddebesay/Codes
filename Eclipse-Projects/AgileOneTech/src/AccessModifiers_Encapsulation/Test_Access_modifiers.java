package AccessModifiers_Encapsulation;

public class Test_Access_modifiers {

	public static void main(String[] args) {
		
		//Access Modifier: Control of class members; ( class members are below ) 
		
		//PRIVATE : the code is accessible within the same class
		//PUBLIC : the code is accessible within all the class throughout the projects
		//DEFUALT  : the code is accessible within the same package
		//PROTECTED : Only child class have accessible to the code by extending (Inheritance)
		
		database cl = new database("john");
		
		
		System.out.println(cl.name);   // as you can see we are able to locate name because it was public
	//	System.out.println(cl.);	   // as you can see we are not able to locate SSN because it is Private	
		
		System.out.println(cl.getSSN());     // how to use getter
		
		cl.setSSN("691-04-5877");     // how to use setter
		
		System.out.println(cl.getSSN());
		
		System.out.println(cl.Address);
		
}
	

}