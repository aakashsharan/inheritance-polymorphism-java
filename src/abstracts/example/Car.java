package abstracts.example;

public abstract class Car {
	
	// #4 from notes.txt abstract methods cannot provide method definitions.
	public abstract String getType();

	public abstract int getNumberOfSeats();
	
	// #5 from notes.txt
	public String toString() {
		return "I am an abstract class";
	}

}

