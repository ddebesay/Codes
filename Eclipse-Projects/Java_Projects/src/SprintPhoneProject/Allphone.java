package SprintPhoneProject;

public class Allphone {

	String name;
	String model;
	int price;
	boolean hasCamera;
	

	public Allphone(String name, String model, int price, boolean hasCamera) {

		this.name = name;
		this.model = model;
		this.price = price;
		this.hasCamera = hasCamera;
	
	
	} 

	void info() {
		System.out.println("Name of the phone: " + this.name);
		System.out.println("Name of the Model: " + this.name + " " + this.model);
		System.out.println("The price is: $" + this.price);
		System.out.println("......");
	}

	void phoneCalling(String phoneNumber) {
		System.out.println(this.name + " is calling: " + phoneNumber);
	}

	void sendSms(String text) {
		System.out.println(this.name + " is sending Text: " + text);
	}

	void takePhoto() {
		System.out.println(this.name + this.model + " does take a photo's");
	}

	void sendMMS() {
		System.out.println(this.name + this.model + "sending MMS file");

	}

	
}
