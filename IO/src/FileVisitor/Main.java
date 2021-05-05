package FileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JTree;

public class Main {
	public static void main(String[] args) throws IOException {
		JFrame window = new JFrame("Файловое дерево");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 480);
		Path path = Paths.get("./IO");
		/*
		 * Не совсем правильная структура вышла, но хотя бы поэкспереметировал с FileVisitor'ом ;)
		 */
		TheVisitor visitor = new TheVisitor(path.toAbsolutePath().toString());
		Files.walkFileTree(path, visitor);
		window.add(new JTree(visitor.getTree()));
		window.setVisible(true);
	}
}
