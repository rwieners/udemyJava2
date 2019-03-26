package meineLoesung;

public class Manager extends Employee{
	
	private int numberOfEmployees;
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Manager(String fn, String ln, long id, int noe){
		super(fn, ln, id);
		this.numberOfEmployees = noe;
		System.out.println("Überladener Konstruktor Manager");	
	}
	public Manager(){
		System.out.println("normaler Konstruktor Manager");
	}

}
