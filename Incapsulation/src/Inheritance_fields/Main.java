package Inheritance_fields;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Mark";
		dog.age = 5;
		dog.breed = "German Shepherd";
		dog.weight = 12; //lbs
		System.out.println(dog);
	}
}
