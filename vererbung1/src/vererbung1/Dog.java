package vererbung1;

public class Dog extends Animal{
	
	
	
	
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Methoden
	public void bark(){
		
		System.out.println("kl�ff..kl�ff...");
	}
	
	public void sayColor(){
		System.out.println("Farbe: " + this.getColor());
	}




}
