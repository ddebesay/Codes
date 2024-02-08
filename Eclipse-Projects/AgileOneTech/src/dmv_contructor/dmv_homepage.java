package dmv_contructor;

public class dmv_homepage {

	public static void main(String[] args) {

		database daniel = new database ("Daniel", 28, "M", "C0001",true); // Calling method from other class 
		database jon = new database ("Jon", 28, "M", "C0002",true);       // and entering parameters 
		database ron = new database ("Ron", 24, "M", "null",false);
		database bella = new database ("Bella", 26, "F", "C0006",true);
		database sky = new database ("Sky", 26, "F", "null",false);
				
		
		
		ron.searchbox();
		
		
		
		//daniel.printoutpage();  
		//jon.printoutpage();
		//ron.printoutpage();
		//bella.printoutpage();
		//sky.printoutpage();
	}

}
