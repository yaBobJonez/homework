package OverridingToString;

public class Main {
	public static void main(String[] args) {
		String s1 = new String("First");
		String s2 = new String("First");
		String s3 = new String("Second");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
