package PolyMorphismAndAbstractPractice;

public class NovaHomepageApp {

	public static void main(String[] args) {
		Students st1 = new Students("Jon", 35, null);
		st1.showInfo();
		
		st1.getSSN();
		System.out.println(st1.getSSN());
		st1.setSSN("154-24-0143");
		
		System.out.println(st1.getSSN());
}
}