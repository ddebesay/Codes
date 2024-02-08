package nba_2krating_Methods_conditions;

import java.util.Scanner;

public class NBARuntime {

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE NBA 2KRATING.. SELECT YOUR TIERS ");
		NBA2krating nba = new NBA2krating();
		Scanner sc = new Scanner(System.in);
		String SELECTTIERS = sc.nextLine();
		
		String  tiers = SELECTTIERS;
		
		if (tiers.equalsIgnoreCase("tier1")) {
			nba.tier1();
		}
		else if (tiers.equalsIgnoreCase("tier2")) {
			nba.tier2();
		} 
		else if (tiers.equalsIgnoreCase("tier3")) {
			nba.tier3();
		} 
		else {
			System.out.println("Select correct tiers");
		}
	}

}
