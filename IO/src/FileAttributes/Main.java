package FileAttributes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;

public class Main {
	public static void main(String[] args) throws IOException {
		File f1 = new File(Main.class.getResource("file1.txt").getPath());
		File f2 = new File(Main.class.getResource("file2.txt").getPath());
		if(!f1.exists()) f1.createNewFile();
		if(!f2.exists()) f2.createNewFile();
		FileWriter w1 = new FileWriter(f1, true);
		w1.write("Task ");
		w1.write("executed.");
		w1.flush();
		w1.close();
		FileWriter w2 = new FileWriter(f2, true);
		w2.write("Oh, it's ");
		w2.write("April btw.");
		w2.flush();
		w2.close();
		System.out.println(f1.length() +" & "+ f2.length());
		String abs = f1.getAbsolutePath();
		Path absPath = Paths.get(abs);
		System.out.println(absPath);
		BasicFileAttributes attributes = Files.readAttributes(absPath, BasicFileAttributes.class);
		System.out.printf("%s:\n\t@ %s : %s : %s\n\t%s, %s\n", abs,
			attributes.creationTime(), attributes.lastModifiedTime(), attributes.lastAccessTime(),
			attributes.isDirectory(), attributes.isRegularFile()
		); DosFileAttributes dos = Files.readAttributes(absPath, DosFileAttributes.class);
		System.out.printf("%s\n\tHidden? %s; Read-Only? %s\n", abs, dos.isHidden(), dos.isReadOnly());
		PosixFileAttributes posix = Files.readAttributes(absPath, PosixFileAttributes.class);
		System.out.printf("%s\n\tKey: %s\n\tPerms:\n", abs, posix.fileKey());
		for(PosixFilePermission el : posix.permissions()) System.out.println("\t\t"+el.name());
	}
}
