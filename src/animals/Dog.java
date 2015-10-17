package animals;

public class Dog extends Animal{
	
	public static final String SPECIES = "DOG";
	
	private String breed;
	
	private String color;

	
	public Dog(String color, int numOfLegs) {
		super(numOfLegs);
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "I am a " + SPECIES + " and my DOGGY COLOR is " + this.color;
	}
	
	public boolean isCute(int age) {
		return (age < 3 && age > 0);
	}
	
	public void cuteness(int age) {
		if(this.isCute(age)) {
			System.out.println("I am super duper cute.");
			System.out.println(toString());
		}
		else {
			System.out.println("I am super cute");
			System.out.println(super.toString()); // static binding to super.
			System.out.println(toString()); // dynamic binding to this. so it is basically this.toString()
		}
	}
}
