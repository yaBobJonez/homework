package Abstraction;

public class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("Кот бежит...");
	}
	@Override
	public void say() {
		System.out.println("MEOW!");
	}
}
