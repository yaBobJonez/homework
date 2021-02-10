package OverridingObject;

public class Main {
	public static void main(String[] args) {
		Bird bird = new Bird();
		Penguin penguin = new Penguin();
		Swallow swallow = new Swallow();
		bird.move();
		penguin.move();
		swallow.move();
	}
}
