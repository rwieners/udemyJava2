package meineLoesung;

public class Program {

	public static void main(String[] args) {
		
		Assistant Assi1 = new Assistant("Anni", "Assi", 10001, 65); // String fn, String ln, long id, int hpw
		Assistant Assi2 = new Assistant(); 
		
		Manager Manag1 = new Manager("Manni", "Manager", 20001, 15); //String fn, String ln, long id, int noe
		Manager Manag2 = new Manager();
	
		System.out.println("\nSpezielle Konstruktoren:");
		
		System.out.println("Vorname: " + Assi1.getFirstName());
		System.out.println("Nachname: " + Assi1.getLastName());
		System.out.println("PersID: " + Assi1.getEmployeeID());
		System.out.println("Wochenstunden: " + Assi1.getHoursPerWeek());
		
		System.out.println("Vorname: " + Manag1.getFirstName());
		System.out.println("Nachname: " + Manag1.getLastName());
		System.out.println("PersID: " + Manag1.getEmployeeID());	
		System.out.println("Anzahl Angestellter: " + Manag1.getNumberOfEmployees());	
	}
}
