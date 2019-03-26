package vererbung1;

public class Animal {
	
	String name;
	int age;
	private String color = "braun";
	String favFood;
	
	public void sleep(){
		System.out.println("Ich schlafe");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}


	
}
