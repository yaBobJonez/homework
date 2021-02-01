package PW2_1Task1;

public class Main {
	public static void main(String[] args) {
		Developer basic = new Developer(4, "PHP");
		Junior jr = new Junior(2, "Java", 21, "Jayfeather");
		Senior sr1 = new Senior(7, "JavaScript", 43, "Brightheart");
		Senior sr2 = new Senior(4, "PHP", 15, "Mudclaw");
		System.out.println(jr instanceof Developer);
		System.out.println(sr1 instanceof Object);
		System.out.println(basic.equals(jr));
		System.out.println(basic.equals(sr2));
	}
}