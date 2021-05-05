package PW4_7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) throws IOException {
		//1.
		File f1 = new File("/home/michael/eclipse-workspace/Homework/input.txt");
		if(!f1.exists()) f1.createNewFile();
		//2.
		File f2 = new File("inputNew.txt");
		System.out.println("Файл inputNew.txt " +(f2.exists()?"":"не")+ " существует.");
		//3.
		File f3 = new File("javaNew");
		if(!f3.exists()) f3.mkdir();
		//4. (запись тремя способами)
		BufferedWriter buffWr = new BufferedWriter(new FileWriter(f2));
		buffWr.write("First\n");
		buffWr.close();
		FileOutputStream fOutStream = new FileOutputStream(f2, true);
		fOutStream.write("Second\n".getBytes("UTF-8"));
		fOutStream.close();
		Files.write(f2.toPath(), "Third".getBytes(), StandardOpenOption.APPEND);
		System.out.println("Длина файла: "+f2.length());
		//5. (пользователь сам вырибает папку с помощью JFileChooser)
		JFileChooser fileChooser = new JFileChooser(".");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		System.out.println("Выберете папку, куда переместить файл inputNew.txt.");
		if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
			f2.renameTo( new File(fileChooser.getSelectedFile().getAbsolutePath() +"/"+ f2.getName()) );
		} //6.
		f1.delete();
		//7.
		System.out.println(f3.getPath() +" это "+ (f3.isDirectory()?"папка.":"файл."));
		//8.
		File thisFolder = new File(".").getAbsoluteFile().getParentFile();
		if(!thisFolder.isDirectory()) throw new IOException("Эта ошибка не должна случиться.");
		System.out.println(thisFolder.getName()+" ("+thisFolder.length()+"):");
		for(File el : thisFolder.listFiles()) System.out.println("\t"+el.getName());
	}
}
