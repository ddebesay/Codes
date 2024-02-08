package OOPs;

public class returnType {

	public static void main(String[] args) {
		returnType rt = new returnType();
	
		// System.out.println(rt.addition());         // this is how you will be able to print 
		
		int res = rt.addition() + 650;       // you can store the result (rt.addition()) + nums and print the results. ways to use return types
		System.out.println(res);
		 

	}
	int addition () {    // return type, NEEDS to start with primitive data type { String, int, Boolean }  
		int x = 10; 
		int y = 25; 
		int res = x + y; 
		return res;			// Note it needs to end with return and containing a message or results numbers. however it will not print only return data 
	} 
}
