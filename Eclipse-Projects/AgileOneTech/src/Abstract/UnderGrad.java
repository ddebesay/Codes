package Abstract;

public class UnderGrad extends Students {	//Child Class 

	String major;
	int amountPaid;
	int finalPayment = 3500;
	
	
	
	public UnderGrad(String name, int age, String major, int amountPaid ) {
		super(name, age);
		this.major = major;
		this.amountPaid = amountPaid;
		
	}

	@Override
	String getDetailInfo() {
		String detailInfo = "I am a Undergrad student and my major is: " + this.major;
		return detailInfo;
	}

	@Override
	int getPaymnetInfo() {
		int paymenttotal = finalPayment - amountPaid;
		return paymenttotal ;
	}    


}
