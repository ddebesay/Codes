package PolyPractice;

public class Bus extends Transport{
	int ticketPrice = 50; 
	int ticketpaid;
	public Bus(String name, int ticketpaid) {
		super();
		this.ticketpaid = ticketpaid;
	}

	/*
	@Override
	int ticketnumber() {
		int res = ticketPrice - ticketpaid;
		return res;
	
	}
		
*/	
}
