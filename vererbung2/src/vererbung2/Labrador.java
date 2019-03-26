package vererbung2;

public class Labrador extends Dog{

	private String nickName;
	
	public Labrador(String name, String color, boolean tail, String nickName) {
		super(name, color, tail);
		this.nickName = nickName;
		System.out.println("Konstruktor Labrador");
	}
}
