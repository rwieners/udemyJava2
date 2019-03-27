
public class Commerzbank extends Bank {
	
	public Commerzbank(){
		System.out.println("StandardKonstruktor Commerzbank");

	}
	
	
	public Commerzbank(double budget){
		super(budget);
		System.out.println("Name der Bank " + getName());
		setKredit(4000);
		System.out.println("Kreditrahmen: " + getKredit());	
		System.out.println("Kontostand: " + getKontoStand());
	}


	

}
