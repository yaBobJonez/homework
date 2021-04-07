package PathTrace;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
	public static void main(String[] args) throws IOException {
		Path path = Path.of(Main.class.getResource("Test.txt").getPath());
		System.out.println(path.getFileName() +":\n\tRoot: "+ path.getRoot() +"\n\tParent: "+ path.getParent());
		for(Path el : path) System.out.println("\t\t# "+ el);
	}
}
