package SprintPhoneProject;

public class SmartPhone extends Allphone {

	public SmartPhone(String name, String model, int price, boolean hasCamera) {
		super(name, model, price, hasCamera);
		
	}
	void sendMMS (int fileSize ) {  
		System.out.println(super.name + super.model + " is able to send " + fileSize + "MB MMS");
	}
}
