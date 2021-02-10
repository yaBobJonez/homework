package PW2_1Task1;

public class Senior extends Developer {
	protected int age;
	protected String name;
	public Senior(int experience, String language, int age, String name) {
		super(experience, language);
		this.age = age;
		this.name = name;
	}
}
