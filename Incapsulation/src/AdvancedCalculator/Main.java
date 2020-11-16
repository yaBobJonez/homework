package AdvancedCalculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("> ");
			String input = sc.nextLine();
			if(input.isBlank() || input.equals("exit")) return;
			Lexer lx = new Lexer(input);
			Parser pr = new Parser(lx.tokenize());
			System.out.println("< " + pr.parse().eval());
		}
	}
}
