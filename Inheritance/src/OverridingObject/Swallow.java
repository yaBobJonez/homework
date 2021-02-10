package OverridingObject;

public class Swallow extends Bird {
	@Override
	protected void move(){
		System.out.println("A swallow (bird) flies.");
	}
}
