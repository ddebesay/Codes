package SauceDemo;

public class loginPage {
	
	
	//properties 
	String	Username;
	String	Password;
	
	
	public loginPage(String username, String password) {
		this.Username = username;
		this.Password = password;
	}
	void overview () {
		loginPage LP = new loginPage(Username, Password);
		LP.printpage();
		LP.clickLogin();
	} 

	// Methods


	
	void printpage () {
		String un = "standard_user";
		String pw = "secret_sauce";
		if (this.Username.equals(un) && this.Password.endsWith(pw)) {
			System.out.println ("You have enter the correct Username & password");
		}
		else {
			System.out.println("Incorrect ");
		}
	}
		void clickLogin () {
			String un = "standard_user";
			String pw = "secret_sauce";
			if (this.Username.equals(un) && this.Password.endsWith(pw)) {
				System.out.println("You have successfully logged in");
			}
			
			else {
				System.out.println("Please Enter the Correct Username & Password ");
			} 
			
	}
}
