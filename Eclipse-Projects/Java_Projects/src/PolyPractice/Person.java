package PolyPractice;

public  class Person {
		String name; 
		int age;
		
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		
		void travel (String location, Transport trans) {
			System.out.println(this.name + " is " + this.age + " years old." + this.name + " like to visit " + location + " by " + trans.name);
		}
		
	
}
