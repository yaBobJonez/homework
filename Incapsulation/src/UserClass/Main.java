package UserClass;

public class Main {
	public static void main(String[] args) {
		User person1 = new User("Michael", "Hummington", 1989);
		User person2 = new User("Jack", "Bondervolls", 1976);
		User person3 = new User("Hawk", "frost", 2005);
		System.out.println(person1.getAge());
		System.out.println(person2.getAge());
		System.out.println(person3.getAge());
	}
}
