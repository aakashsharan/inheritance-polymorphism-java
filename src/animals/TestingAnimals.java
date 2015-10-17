package animals;

public class TestingAnimals {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Dog();
		Animal animal3 = new GoldenRetriever("cream");
		
		System.out.println(animal3);
	}
}
