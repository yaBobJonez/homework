package Super2;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(7, "Poodle", 120, "Poly");
		System.out.println(dog.getWeight() +" "+ dog.getBreed() +" "+ dog.price +" "+ dog.name);
	}
}
