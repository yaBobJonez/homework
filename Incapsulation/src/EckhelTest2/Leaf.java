package EckhelTest2;

public class Leaf {
	protected int i = 0;
	Leaf increment(){
		this.i++;
		return this;
	}
	void print(){
		System.out.printf("i = %d\n", this.i);
	}
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
