package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Bird sw = new Swallow();
		Bird ost = new Ostrich();
		Bird peng = new Penguin();
		Bird[] birds = {sw, ost, peng};
		for(Bird b : birds) b.move();
		Swallow s = new Swallow();
		Swallow s1 = s.of(); //Covariant return
		Swallow s2 = s.of();
	}
}
class Bird{
	void move(){ System.out.println("A bird moves."); }
	Bird of(){ return new Bird(); }
}
class Swallow extends Bird{
	void move(){ System.out.println("A swallow flies."); }
	Swallow of(){ return new Swallow(); } //Covariant return: returning child's class instance
}
class Ostrich extends Bird{
	void move(){ System.out.println("An ostich runs."); }
	Bird of(){ return new Ostrich(); }
}
class Penguin extends Bird{
	/*static*/ void move(){ System.out.println("A penguin walks."); } //Impossible to override statics in Java
	Bird of(){ return new Penguin(); }
}
class Unknown extends Bird{
	void move(){ System.out.println("An unidentified bird crawls."); }
	Bird of(){ return new Unknown(); }
}