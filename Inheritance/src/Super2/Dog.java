package Super2;

public class Dog extends Animal {
	int price;
	String name;
	public Dog(int weight, String breed, int price, String name) {
		super(weight, breed);
		this.price = price;
		this.name = name;
	}
}
