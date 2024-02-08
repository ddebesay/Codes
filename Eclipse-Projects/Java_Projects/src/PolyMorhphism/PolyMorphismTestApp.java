package PolyMorhphism;

public class PolyMorphismTestApp {

	public static void main(String[] args) {
		
			//students class // we need a student 
			// our  student will travel { Arizona , New York, Canada }
			// by Bus
			
		Students jon = new Students("Jon", 25);
		Bus GreyHound = new Bus("Grey Hound");
		jon.bus("New York", GreyHound);
			
		System.out.println("-------------");
		
		Students bob = new Students("bob", 30);
		Train amtrak = new Train("AmTack");
		bob.train("Florida", amtrak);
		
		System.out.println("-------------");
		
		Students jennifer = new Students("Jennifer", 25);
		Plane Airline = new Plane("United Airline");
		jennifer.plane("Italy", Airline);
	}
		
}
