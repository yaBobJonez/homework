package Exceptions7;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
	}
}
class Parent{
	void createFile(File f){
		System.out.println(f.getName());
	}
}
class Child extends Parent{
	@Override
	void createFile(File f){
		super.createFile(f);
		try { if(!f.exists()) f.createNewFile(); }
		catch(IOException e){ System.err.println("Exception thrown."); }
	}
}