package Abstraction;

public class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("Собака ходит...");
	}
	@Override
	public void say() {
		System.out.println("WOOF!");
	}
}
