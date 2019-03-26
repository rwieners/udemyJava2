package meineLoesung;

public class Employee extends Person{
	
	private long employeeID;
	
	public Employee(String fn, String ln, long id){
		super(fn, ln);
		this.employeeID = id;
	}
	
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public Employee(){
		
	}
}
