
public class UniCredit extends Bank {
	
	public UniCredit(){
		System.out.println("Konstruktor UniCredit");
		setKredit(6000);
		System.out.println("Kreditrahmen: " + getKredit());
	}

}
