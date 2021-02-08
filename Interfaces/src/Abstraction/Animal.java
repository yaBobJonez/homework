package Abstraction;

public abstract class Animal {
	abstract public void move();
	abstract public void say();
	public void eat(){};
	public Animal(){
		System.out.println("Животное ест.");
	}
}
