package animals;

public class Animal {

	private int numOfLegs;

	public Animal() {

	}

	public Animal(int legs) {
		this.numOfLegs = legs;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public void myColor(String color) {
		System.out.println("My color is: " + color);
	}

	// overriding toString method of Object. All class extends Objects
	public String toString() {
		return "I have " + numOfLegs + " legs";
	}

}
