package Inheritance_fields;

public class Dog extends Animal {
	int age;
	String name;
	@Override
	public String toString() {
		return "Dog[name = " + this.name + ", breed = " + this.breed + ", weight = " + this.weight + ", age = " + this.age + "]";
	}
}
