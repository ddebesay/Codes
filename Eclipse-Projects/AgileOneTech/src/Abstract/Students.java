package Abstract;

public abstract class Students {   //Parent Class
		String name;
		int age;
		
		
		public Students(String name, int age) {
			this.name = name;
			this.age = age;
		} 
		
		abstract String getDetailInfo();   // adding and abstract method for child class to complete it
		
		abstract int getPaymnetInfo();
		
	void showCommonInfo () {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	} 
}
