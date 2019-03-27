
public class DeutscheBank extends Bank{
	
		public DeutscheBank(){		

		System.out.println("Name der Bank: "+ getName());
		setKredit(5000);
		System.out.println("Kreditrahmen: " + getKredit());
		}

}
