package OOPS_Agile;

public class AgileTechRegistrationAPP {

	public static void main(String[] args) {
		
	/*	
		Students jon = new Students("Jon Jones", 35, true, "SQA", 3400);
		Students bob = new Students("Bob Burger", 28, false, "SQA", 4000);
		
		bob.regStatus();
		
	
		
		Employees nina = new Employees("Nina", "Admin");
		
		
		nina.doRegistration("Jon Jones", 35, true, "SQA", 3400);
		nina.doRegistration("Bob Burger", 28, false, "SQA", 4000);
		nina.doRegistration("Don King", 31, true, "BA", 5779);
	
		*/
	
	
		Employees nina = new Employees(null, null);
		nina.hireInstructor("Brian Johnson" ,"Brian.Johnson@agile1tech.com", "JAN-01-2006", 6);
		nina.hireInstructor("Jordan Clark" ,"Jordan.Clark@agile1tech.com", "FEB-01-2005", 8);
		nina.hireInstructor("Dina Harper" ,"Dina.Harper@agile1tech.com", "JUNE-01-2023", 2);
		
		
	}

}
