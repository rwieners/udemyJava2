
public class KfW extends Bank {
	
	public KfW(){

		System.out.println("Konstruktor KfW");
		setKredit(3000);
		System.out.println("Kreditrahmen: " + getKredit());	
	}

}
