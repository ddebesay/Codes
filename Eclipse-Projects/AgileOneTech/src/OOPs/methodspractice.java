package OOPs;

import java.util.Scanner;

public class methodspractice {

	public static void main(String[] args) {

		System.out.println("WELCOME TO NBA 2K RATING");
		System.out.println("PICK YOUR TIERS");

		methodspractice mp = new methodspractice();
		
		Scanner sc = new Scanner(System.in);
		 String NBATIERS = sc.nextLine();
		
		mp.NBARatings(NBATIERS);

	}

	void NBARatings(String Teams) {

		if (Teams.equals("Tier1")) {
			System.out.println("The Boston Celtics rating is: 83");
			System.out.println("The Cleveland Cavaliers rating is: 82");
			System.out.println("The Denver Nuggets rating is: 82");
			System.out.println("The Golden State Warriors rating is: 82");
			System.out.println("The Los Angles Clippers rating is: 83");
			System.out.println("The Los Angles Lakers rating is: 83");
			System.out.println("The Miami Heats rating is: 81");
			System.out.println("The Milwaukee Bucks rating is: 83");
			System.out.println("The Minnesota Timberwolves rating is: 81");
			System.out.println("The Phoenix Suns rating is: 83");
		}

		else if (Teams.equals("Tier2")) {
			System.out.println("The Chicago Bulls rating is: 80");
			System.out.println("The Dallas Mavericks rating is: 82");
			System.out.println("The Houston Rockets rating is: 80");
			System.out.println("The Indiana Pacers rating is: 81");
			System.out.println("The New Orleans Pelicans rating is: 81");
			System.out.println("The New York Knicks rating is: 81");
			System.out.println("The Oklahoma City Thunder rating is: 81");
			System.out.println("The Philadelphia 76ers rating is: 82");
			System.out.println("The Sacramento Kings rating is: 81");
			System.out.println("The Toronto Raptors rating is: 80");

		} else if (Teams.equals("Tier3")) {
			System.out.println("The Atlanta Hawks rating is: 82");
			System.out.println("The Brooklyn Nets rating is: 81");
			System.out.println("The Charlotte Hornets rating is: 80");
			System.out.println("The Detroit Pistons rating is: 81");
			System.out.println("The Memphis Grizzlies rating is: 82");
			System.out.println("The Orlando Magic rating is: 79");
			System.out.println("The Portland Trail Blazers rating is: 80");
			System.out.println("The San Antonio Spurs rating is: 79");
			System.out.println("The Utah Jazz rating is: 79");
			System.out.println("The Washington Wizards rating is: 79");
		} else {
			System.out.println("NONE FOUND");
		}

	}

}	
	    	
	    
	    
	    
	    
	    
	    
	    
	    

