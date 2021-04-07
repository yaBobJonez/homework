package PathLocation;

import java.nio.file.Path;

public class Main {
	public static void main(String[] args) {
		Path path = Path.of("./Test.txt");
		System.out.println(path.getFileName() +" — "+ path.toUri() +"\n\t@ "+ path.toAbsolutePath() +"\n\t@ "+ path.normalize());
	}
}
