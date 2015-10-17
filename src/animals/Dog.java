package animals;

public class Dog extends Animal{
	
	public static final String SPECIES = "DOG";
	
	private String breed;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String toString() {
		return "I am a " + SPECIES;
	}
}
