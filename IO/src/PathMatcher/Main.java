package PathMatcher;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./IO");
		String pattern = "regex:file[0-9]*\\.\\S+"; //Найти все файлы, начинающиеся на "file" и число.
		Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
			PathMatcher matcher = FileSystems.getDefault().getPathMatcher(pattern);
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				if(matcher.matches(dir.getFileName())) System.out.println(dir.toAbsolutePath().toString());
				return super.preVisitDirectory(dir, attrs);
			}
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				if(matcher.matches(file.getFileName())) System.out.println(file.toAbsolutePath().toString());
				return super.visitFile(file, attrs);
			}
		});
	}
}
