package interfaces.example;

public class GermanShephard implements Dog {

	int weight;
	
	 /* #3 from notes.txt
	 GermanShephard class need to implement the Dog method or else make the class abstract.*/
	
	public String color() {
		return "Black Golden";
	}

	public String breed() {
		if (weight > 50) {
			return "large";
		} else {
			return "small";
		}

	}
}
