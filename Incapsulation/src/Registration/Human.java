package Registration;

public class Human {
	public static void register(Human human){
		System.out.println(human.name + " зарегестрирован.");
	}
	protected String name;
	public Human(String name) {
		this.name = name;
		register(this);
	}
	public static void main(String[] args) {
		new Human("Jay");
	}
}
