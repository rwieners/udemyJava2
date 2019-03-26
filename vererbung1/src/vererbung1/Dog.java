package vererbung1;

public class Dog extends Animal{
	
	
	//Konstruktor
	public Dog(String color){
		super(color);
	}
	
	
	
	//Methoden
	public void bark(){
		
		System.out.println("kläff..kläff...");
	}
	
	public void sayColor(){
		System.out.println("Farbe: " + this.getColor());
	}




}
