
public class Bank {


	protected String name;
	protected double kredit;
	protected double kontoStand;

	public Bank(double budget){
		System.out.println("\nKonstruktor Bank");
		setKontoStand(budget);
	}
	
	public Bank(){
		System.out.println("\nStandardKonstruktor Bank");
	
	}
	
	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	public String getName() {
		return name;
	}
	public double getKredit() {
		return kredit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKredit(double kredit) {
		this.kredit = kredit;
	}
}
