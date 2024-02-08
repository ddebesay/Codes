package OOPs;

import java.util.Scanner;

public class Methodsreview {

	public static void main(String[] args) {
		System.out.println("HELLO: PICK COUNTRY");
		Methodsreview MR = new Methodsreview();
		Scanner sc = new Scanner(System.in);
		String cars = sc.nextLine();

		MR.Cars(cars);

	}

	void Cars(String cars) {

		if (cars.equals("American")) {
			System.out.println("JEEP");
			System.out.println("LINCOLN");
			System.out.println("MUSTANG");
			System.out.println("CORVETTE");
			System.out.println("TESLA");
			System.out.println("FORD");
		} else if (cars.equals("Japan")) {
			System.out.println("BENTLEY");
			System.out.println("NISSAN");
			System.out.println("TOYOTA");
			System.out.println("HONDA");
			System.out.println("SUBARU");
			System.out.println("MAZDA");
		} else if (cars.equals("Germany")) {
			System.out.println("BMW");
			System.out.println("MERCEDES BENZ");
			System.out.println("PORSCHE");
			System.out.println("VOLKSWAGEN");
			System.out.println("ALPINA");
			System.out.println("AUDI");
		} else if (cars.equals("Italy")) {
			System.out.println("LAMBORGHINI");
			System.out.println("FERRARI");
			System.out.println("FIAT");
			System.out.println("MASERATI");
			System.out.println("ABARTH");
			System.out.println("ALFA ROMEO");
		} else if (cars.equals("France")) {
			System.out.println("RENAULT");
			System.out.println("ALPINE");
			System.out.println("AIXAM");
			System.out.println("VENTURI");
			System.out.println("CITROEN");
			System.out.println("DELAGE");
		} else if (cars.equals("Korea")) {
			System.out.println("KIA");
			System.out.println("HYUNDAI");
			System.out.println("KG");
		} else {
			System.out.println("NA");
		}
	}

}
