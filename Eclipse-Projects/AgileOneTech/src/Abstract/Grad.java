package Abstract;

public class Grad extends Students  {  //Child Class

	String researchTopic;
	int amountPaid;
	int finalPayment = 3500;
	
	public Grad(String name, int age, String researchTopic, int amountPaid) {
		super(name, age);
		this.researchTopic = researchTopic;
		this.amountPaid = amountPaid;
	}	

	@Override
	String getDetailInfo() {
		return "I am a Graduate Student and my major is: " + this.researchTopic;
	}

	@Override
	int getPaymnetInfo() {
		int paymenttotal = finalPayment - amountPaid;
		return paymenttotal;
	}

}
