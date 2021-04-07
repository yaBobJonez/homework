package Readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		File f1 = new File(Main.class.getResource("file1.txt").getPath());
		FileReader reader = new FileReader(f1);
		BufferedReader buff = new BufferedReader(reader);
		String line;
		while((line = buff.readLine()) != null){
			System.out.println(line);
		} buff.close();
		FileWriter writer = new FileWriter(f1, true);
		PrintWriter prt = new PrintWriter(f1);
		prt.println("More");
		prt.println("Data");
		prt.flush();
		prt.close();
		writer.close();
	}
}
