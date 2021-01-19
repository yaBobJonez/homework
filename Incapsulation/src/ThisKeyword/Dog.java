package ThisKeyword;

public class Dog {
	protected String name; //Имя
	protected int age; //Возраст
	public Dog(String nameString, int ago) { //Конструктор
		this.name = nameString;
		this.age = ago;
	}
	public String toString() {
		return name + " " + age;
	}
}
