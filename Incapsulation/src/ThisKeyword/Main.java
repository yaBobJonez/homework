package ThisKeyword;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Ralph", 3);
		Dog dog1 = new Dog("Ralph", 3);
		Dog dog2 = new Dog("Polie", 5);
		
		System.out.println(dog.equals(dog1));
		System.out.println(dog.equals(dog2));
		
		System.out.println(dog); //Выводим dog методом toString (Java использует этот метод, чтобы перевести объект в строку).
	}
}
