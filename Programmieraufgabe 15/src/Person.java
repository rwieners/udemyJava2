
public class Person {
	
	private String vname, nname;
	private long budget;
	
	Person(String vname,String nname,long budget){
		setVname(vname);
		setNname(nname);
		setBudget(budget);
	}
	
	public String getVname() {
		return vname;
	}
	public String getNname() {
		return nname;
	}
	public long getBudget() {
		return budget;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}


}
