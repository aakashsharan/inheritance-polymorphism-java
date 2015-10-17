package animals;

public class GoldenRetriever extends Dog {

	public static final String[] breeds = { "small", "medium", "large", "very large" };
	
	public GoldenRetriever(String color, int numOfLegs){
		super(color, numOfLegs);
	}

	public String toString(){
		return "I am a " + breeds[2] + " breed dog and my color is " + getColor();
	}
	
	public boolean isCute(int age) {
		return (age >= 4);
	}
}
