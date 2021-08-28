package OverloadedStringMethods;

import Common.Input;

public class HomeworkFindAllOccurances {
	public static void main(String[] args) {
		String str = "This is an example string.";
		String search = Input.input("Введите искомый символ (или строку):");
		for(int i = 0; i < str.length(); i++){
			int indexOfSubstring = str.indexOf(search, i);
			if(indexOfSubstring == -1) break;
			System.out.println(indexOfSubstring);
			i = indexOfSubstring;
		}
	}
}
