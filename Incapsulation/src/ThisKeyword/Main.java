package ThisKeyword;

public class Main {
	public static void main(String[] args) {
		String str = "Ostap";
		System.out.println(str);
		
		Dog dog = new Dog("Ralph", 3);
		System.out.println(dog); //Выводим dog методом toString (Java использует этот метод, чтобы перевести объект в строку).
		//System.out.println(dog.name + " " + dog.age);
	}
}
