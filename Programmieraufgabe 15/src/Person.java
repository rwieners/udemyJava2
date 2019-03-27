
public class Person {
	
	private String vname, nname;
	private double budget;
	
	public Person(String vname,String nname,double budget){
		
		System.out.println("Konstruktor Person");
		setVname(vname);
		setNname(nname);
		setBudget(budget);
		
		System.out.println("Vorname: "+ getVname());
		System.out.println("Nachname: "+ getNname());
		System.out.println("Budget: "+ getBudget());
		openBankaccount(budget);
		
	}
	
	public void openBankaccount(double budget){
		Commerzbank obj = new Commerzbank(budget);	
	}

	public String getVname() {
		return vname;
	}


	public String getNname() {
		return nname;
	}


	public double getBudget() {
		return budget;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}


}
