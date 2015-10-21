package abstracts.example;

public class Coupe extends Car{

	public final static int SEATS = 4;
	
	// #6 from notes.txt
	public String getType() {
		return "coupe";
	}

	public int getNumberOfSeats() {
		return SEATS;
	}
}

