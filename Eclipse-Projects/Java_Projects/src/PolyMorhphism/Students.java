package PolyMorhphism;

public class Students {
		String name; 
		int age;
		
		public Students(String name, int age) {
			this.name = name;
			this.age = age;
	} 
		
		
		void bus (String destination, Bus bus) {
			System.out.println(this.name + " is " + this.age + " Years old and traveling to " + destination + " By " + bus.name);
	}
		
		void train (String destination, Train train) {
			System.out.println(this.name + " is " + this.age + " Years old and traveling to " + destination + " By " + train.name);
		
}
		void plane (String destination, Plane plane) {
			System.out.println(this.name + " is " + this.age + " Years old and traveling to " + destination + " By " + plane.name);
		
}
}