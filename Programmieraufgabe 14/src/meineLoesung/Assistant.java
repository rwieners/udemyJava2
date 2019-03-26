package meineLoesung;

public class Assistant extends Employee{
	
	private int hoursPerWeek;
	
	public Assistant(String fn, String ln, long id, int hpw){
		super(fn, ln, id);
		this.hoursPerWeek = hpw;
	System.out.println("Überladener Konstruktor Assistent");	
	}
	
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public Assistant(){
		System.out.println("normaler Konstruktor Assistent");	
	}

}
