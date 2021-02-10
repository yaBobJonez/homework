package HW1_26Task1;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("Hawk", "Frost", 2005);
		User user2 = new User("Fire", "Star", 2003);
		User user3 = new User("Lion", "Blaze", 2007);
		User user4 = new User("Hawk", "Frost", 2006);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		System.out.println(user1.equals(user4));
	}
}
