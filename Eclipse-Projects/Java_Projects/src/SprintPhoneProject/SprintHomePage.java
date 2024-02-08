package SprintPhoneProject;

public class SprintHomePage {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Iphone", "15 Pro Max", 1500, true);
		sp.info();
		sp.phoneCalling("(703)254-0144");
		sp.sendSms("I am not going to school today");
		sp.takePhoto();

		
		
		System.out.println("----------------------------------------------");
		
		NonSmartPhone nsp = new NonSmartPhone("Nokia","Nokia 3310 Blue", 70, false);
		nsp.info();
		nsp.phoneCalling("(703)254-0144");
		nsp.sendSms("I did not pick up the kids");
		nsp.takePhoto();
		nsp.sendMMS(300);


}
}