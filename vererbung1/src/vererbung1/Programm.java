package vererbung1;

public class Programm {

	public static void main(String[] args) {
	
		Dog hund = new Dog();
		Cat Katze = new Cat();
		
		hund.sleep();
		hund.bark();
		
		Katze.color = "schwarz";
		
		System.out.println(Katze.color);

	}

}
