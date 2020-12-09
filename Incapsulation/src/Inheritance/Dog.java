package Inheritance;

public class Dog extends Mammal {
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		Animal animal = new Animal();
		Dog dog = new Dog();
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Dog);
	}
}
