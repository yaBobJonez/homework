package Vyazovik;

public class Test {
	protected Object getInstance(){
		return this;
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test == test.getInstance());
	}
}
