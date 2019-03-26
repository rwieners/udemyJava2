package vererbung1;

public class Animal {
	
	String name;
	int age;
	private String color = "braun";
	String favFood;
	

	
	
	//Methoden
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}



	public void move(){
		
		System.out.println("Geschwindigkeit 10km/h");
	}
	
	
	
	public void sleep(){
		System.out.println("Ich schlafe");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor(){
		
		return this.color;
	}


	
}
