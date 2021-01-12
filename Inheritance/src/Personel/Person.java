package Personel;

public class Person {
	String name;
	int age;
	public Person(){
		this("Default", 18);
	}
	public Person(String name) {
		this(name, 18);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Name: %-8s | age %d", name, age);
	}
}
