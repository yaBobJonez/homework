package SuperKeyword;

public class B extends A{
	int i;
	public B(int a, int i) {
		super.i = a;
		this.i = i;
	}
	@Override
	public String toString() {
		return "Super i: " + super.i + ", this i: " + this.i;
	}
}
