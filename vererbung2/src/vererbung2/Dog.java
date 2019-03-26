package vererbung2;

public class Dog extends Animal{
	
	private boolean tail;
	
	public Dog(String name, String color, boolean tail){
		super(name, color);
		this.tail = tail;
		System.out.println("Konstruktor Dog");
	}

}
