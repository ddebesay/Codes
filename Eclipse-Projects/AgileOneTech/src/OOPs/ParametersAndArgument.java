package OOPs;

public class ParametersAndArgument {

	public static void main(String[] args) {
		ParametersAndArgument PA = new ParametersAndArgument();
		PA.addition(25, 30);   // this is how you call the arguments with INT
		PA.word("good-morning");  // this is how you call the arguments with String 
		PA.IsRight(true);
		
				// YOU CAN ALSO MIX STRING, INT, Boolean //
	}
	public void addition (int x, int y) {   // this is how you create parameters with INT 
		
		int res = x + y; 
		System.out.println(res);
	}
	
	public void word (String message) { 	// this is how you create parameters with String
		
		System.out.println(message);
	}
	public void IsRight (boolean IsRight) {	// this is how you create parameters with Boolean
		
		System.out.println(IsRight);
	}
}
