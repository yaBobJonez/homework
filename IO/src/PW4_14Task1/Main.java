package PW4_14Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(Main.class.getResource("file.txt").getPath());
		//Простой вариант Scanner'ом:
		Scanner sc = new Scanner(file);
		sc.useDelimiter("");
		int count = 0;
		while(sc.hasNext()){
			if(sc.next().equals("k")) count+=1;
		} System.out.println(count);
		sc.close();
		//Вариант Stream'ом:
		FileInputStream fileIn = new FileInputStream(file);
		int curr_char = '\0';
		int count2 = 0;
		while((curr_char = fileIn.read()) != -1){
			if(curr_char == 'k') count2+=1;
		} System.out.println(count2);
		fileIn.close();
	}
}
