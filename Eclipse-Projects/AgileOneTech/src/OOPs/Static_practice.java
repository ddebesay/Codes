package OOPs;

public class Static_practice {
	
	
	static {
		System.out.println("TOP BABY ALL DAY ");
	} 
	
	public static void main(String[] args) {
		//Static_practice sp = new Static_practice();
		//sp.method();
		Static_practice_ClassOnly.sub(25,5,"Daniel ");    
		
	//add(5, 7);                               // ways to call 
		
		
	}

	static {
		System.out.println("BOTTOM BABY ALL DAY");
	}
	
	static void method () {
		System.out.println("Changing into STATIC");
		System.out.println("changed");
	} 
	static void add (int x, int y ) {  // you can also use parameters inside static 
	int res = x + y; 
	System.out.println(res);
	
	} 

}
