package AdvancedCalculator;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
	private int position;
	private char curr_char;
	private String input;
	private int size;
	public Lexer(String input) {
		this.input = input;
		this.size = input.length();
		this.position = -1;
		this.advance();
	}
	protected void advance(){
		this.position += 1;
		if(this.position >= this.size) this.curr_char = (char)0;
		else this.curr_char = this.input.charAt(this.position);
	}
	public List<Token> tokenize() throws Exception{
		List<Token> tokens = new ArrayList<>();
		while(this.curr_char != (char)0){
			if(this.curr_char == ' '){ this.advance(); }
			else if("0123456789".indexOf(this.curr_char) != -1){ tokens.add(this.buildNumber()); }
			else if(this.curr_char == '+'){ tokens.add(new Token(TokenList.ADD, 0)); this.advance(); }
			else if(this.curr_char == '-'){ tokens.add(new Token(TokenList.SUBTRACT, 0)); this.advance(); }
			else if(this.curr_char == '*'){ tokens.add(new Token(TokenList.MULTIPLY, 0)); this.advance(); }
			else if(this.curr_char == '/'){ tokens.add(new Token(TokenList.DIVIDE, 0)); this.advance(); }
			else if(this.curr_char == '%'){ tokens.add(new Token(TokenList.MODULO, 0)); this.advance(); }
			else if(this.curr_char == '^'){ tokens.add(new Token(TokenList.POWER, 0)); this.advance(); }
			else throw new Exception("Невалидный ввод");
		} tokens.add(new Token(TokenList.EOF, 0));
		return tokens;
	}
	protected Token buildNumber(){
		String number = "";
		boolean point = false;
		while("0123456789.".indexOf(this.curr_char) != -1){
			if(this.curr_char == '.'){
				if(point == true) break;
				else { point = true; number += "."; }
			} else number += this.curr_char;
			this.advance();
		} if(point == true) return new Token(TokenList.DOUBLE, Double.parseDouble(number));
		else return new Token(TokenList.INT, Double.parseDouble(number));
	}
}
