package DirectoryStreams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		Path dir = Paths.get(Main.class.getResource("Samples").getPath());
		try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(dir)) {
			for(Path f : dirStream) System.out.println(f.getFileName());
		}
	}
}
