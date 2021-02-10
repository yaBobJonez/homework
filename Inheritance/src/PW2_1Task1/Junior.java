package PW2_1Task1;

public class Junior extends Developer {
	protected int age;
	protected String name;
	public Junior(int experience, String language, int age, String name) {
		super(experience, language);
		this.age = age;
		this.name = name;
	}
}
