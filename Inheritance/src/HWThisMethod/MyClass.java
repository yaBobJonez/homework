package HWThisMethod;

public class MyClass {
	int а;
	int b;
	MyClass(int a, int b){
		this.а = a;
		this.b = b;
	}
	MyClass(int i){
		this(i, i);
	}
	MyClass(){
		this(0);
	}
	@Override
	public String toString() {
		return "а = " + this.а + ", b = " + this.b;
	}
}