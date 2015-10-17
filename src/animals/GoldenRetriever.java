package animals;

public class GoldenRetriever extends Dog {

	public static final String[] breeds = { "small", "medium", "large", "very large" };
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GoldenRetriever(String color) {
		this.color = color;
	}
	
	public String toString(){
		return "I am a " + breeds[2] + " breed dog and my color is " + getColor();
	}
}
