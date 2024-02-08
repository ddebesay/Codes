package OOPs;

public class ExceptionHandling {

	public static void main(String[] args) {
	/*	
		System.out.println("Start Here");

		try {
			System.out.println(5 / 0);
		} catch (Exception exception) {
			System.out.println(exception);
		}

		System.out.println("Ends Here");
	*/	
	
	
			System.out.println("Start");
			
			int [] numbers = {1, 2, 3};
			
			
			
			try {
				System.out.println(numbers[3]);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println("End");
	}
	

}
