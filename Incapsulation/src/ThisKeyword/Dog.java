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
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Dog)) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) { if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}
}
