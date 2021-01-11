package EckhelsFlower;

public class Flower {
	int petalCount = 0;
	String initialValue = "начальное значение";
	Flower(int petals){
		petalCount = petals;
		System.out.println("Flower(int)[ petalCount = " + petalCount + " ]");
	}
	Flower(String ss){
		System.out.println("Flower(String)[ initialValue = " + ss + " ]");
		initialValue = ss;
	}
	Flower(String s, int petals){
		this(petals);
		this.initialValue = s;
		System.out.println("Flower(String, int)");
	}
	Flower(){
		this("Hi there", 12);
		System.out.println("Flower()");
	}
	void printPetalCount(){
		System.out.println("petalCount = " + petalCount + ", initialValue = "+ initialValue);
	}
	public static void main(String[] args){
		Flower flower = new Flower();
		flower.printPetalCount();
	}
}
