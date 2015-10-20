package interfaces.example;

public class GermanShephard implements Dog {

	int weight;

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
