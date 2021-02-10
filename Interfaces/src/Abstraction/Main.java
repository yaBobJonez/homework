package Abstraction;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.move(); cat.move();
		dog.say(); cat.say();
	}
}
