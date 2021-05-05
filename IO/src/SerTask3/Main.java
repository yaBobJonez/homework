package SerTask3;

import java.nio.file.Path;

public class Main {
	public static void main(String[] args) {
		Path path = Path.of("Test.txt");
		Path path2 = Path.of("Another.txt");
		System.out.println(path.compareTo(path2)==0);
		System.out.println(path.equals(path2));
		System.out.println(path.toAbsolutePath().equals(path2.toAbsolutePath()));
	}
}
