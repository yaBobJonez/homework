package OverridingObject;

public class Penguin extends Bird {
	@Override
	protected void move(){
		System.out.println("A penguin walks.");
	}
}
