package FileVisitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import javax.swing.tree.DefaultMutableTreeNode;

public class TheVisitor extends SimpleFileVisitor<Path> {
	DefaultMutableTreeNode tree;
	public TheVisitor(String root) {
		this.tree = new DefaultMutableTreeNode(root);
	}
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(dir.getFileName());
		for(File f : dir.toFile().listFiles()){
			if(f.isFile()) node.add(new DefaultMutableTreeNode(f.getName()));
		} tree.add(node);
		return super.preVisitDirectory(dir, attrs);
	}
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.err.println("Ошибка visitor'а!");
		return super.visitFileFailed(file, exc);
	}
	public DefaultMutableTreeNode getTree(){ return this.tree; }
}
