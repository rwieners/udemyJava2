package vererbung1;

public class Tiger extends Animal{
	
	/*
	public void move(){
		
		System.out.println("Geschwindigkeit 10KMH");
	}
*/
	


	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move (){
		super.move();
		System.out.println("Geschwindigkeit 80km/h");
	}
}
