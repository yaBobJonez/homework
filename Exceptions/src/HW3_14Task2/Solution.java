package HW3_14Task2;

import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Solution {
	public static void main(String[] args) {
		processExceptions(new Solution());
	}
	public static void processExceptions(Solution obj) {
		samyiSekretnyKodVMire();
		try {
			obj.method1(); //Код остановится на первом же исключении, как "вывести каждое"?
			obj.method2();
			obj.method3();
		} catch(Exception e){
			//Немного Swing'а :D
			JOptionPane.showMessageDialog(null, e.getClass().getSimpleName(), "Исключение, ага", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void method1() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	public void method2() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
	public void method3() throws NoSuchFieldException {
		throw new NoSuchFieldException();
	}
	
	private static void samyiSekretnyKodVMire(){
		String e = ""; String x = String.valueOf((char)74)+"av"+String.valueOf((char)(621-524));
		try(Scanner scanner = new Scanner(new URL("https://artii.herokuapp.com/make?text="+x+"&font=broadway").openStream(),
	    StandardCharsets.UTF_8.toString())){
	        scanner.useDelimiter("\\A");
	        e += scanner.hasNext() ? scanner.next() : "";
	    } catch(Exception exc){}
		System.out.println(e);
	}
}