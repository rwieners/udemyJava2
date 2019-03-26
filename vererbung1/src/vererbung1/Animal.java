package vererbung1;

public class Animal {
	
	String name;
	int age;
	private String color = "braun";
	String favFood;
	
	//Konstruktor
	public Animal(String color){
		this.color = color;
	}
	
	
	//Methoden
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
