package animals;

public class TestingAnimals {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Dog("black", 4);
		Animal animal3 = new GoldenRetriever("cream", 4);
		
		((Dog) animal3).cuteness(1); // if you don't cast to Dog, compiler error because Animal has no reference to cuteness method.
		
		// also we can do the following
		System.out.println("-----------------");
		Dog animal4 = new GoldenRetriever("golden", 4);
		animal4.cuteness(15);
		
		/*the following will throw runtime error and not compiler error. compiler trusted you when you cast it
		but see, dog is not a golden retriever.*/
		
		// GoldenRetriever animal5 = (GoldenRetriever) new Dog("white", 4);
		
		// you can do the following because a dog is a dog.
		System.out.println("-----------------");
		Dog animal6 = (Dog)new GoldenRetriever("cream", 4);
		animal6.cuteness(3);
		
		System.out.println("-----------------");
		Dog animal7 = new Dog("brown", 4);
		animal7.cuteness(3);
	}
}
