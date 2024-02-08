package SprintPhoneProject;

public class NonSmartPhone extends Allphone {

	public NonSmartPhone(String name, String model, int price, boolean hasCamera) {
		super(name, model, price, hasCamera);
		
	}

	@Override
	void takePhoto() {
		System.out.println(super.model + " does not take Photo's");
	}
	void sendMMS (int fileSize ) {  
		System.out.println(super.model + " is able to send " + fileSize + "KB MMS");
	}
}
