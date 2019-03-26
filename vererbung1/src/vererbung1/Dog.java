package vererbung1;

public class Dog extends Animal{
	
	
	
	
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Methoden
	public void bark(){
		
		System.out.println("kläff..kläff...");
	}
	
	public void sayColor(){
		System.out.println("Farbe: " + this.getColor());
	}




}
