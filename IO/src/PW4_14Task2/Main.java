package PW4_14Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File f1 = new File(Main.class.getResource("file1.txt").getPath());
		File f2 = new File(Main.class.getResource("file2.txt").getPath());
		FileInputStream f1In = new FileInputStream(f1);
		FileInputStream f2In = new FileInputStream(f2);
		boolean identical = true;
		while(true){ //while( (a = f1In.read())!=-1 | (b = f2In.read())!=-1 ) выглядит менее аккуратно.
			int a = f1In.read(), b = f2In.read();
			if(a != b){ identical = false; break; }
			if(a==-1 && b==-1) break;
		} System.out.println(identical);
		f1In.close(); f2In.close();
	}
}
