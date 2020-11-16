package AdvancedCalculator;

import java.util.List;

public class Parser {
	private List<Token> tokens;
	private int position;
	private int size;
	public Parser(List<Token> tokens) {
		this.tokens = tokens;
		this.position = 0;
		this.size = tokens.size();
	}
	public Statement parse() throws Exception{
		return this.addition();
	}
	private Statement addition() throws Exception{
		Statement result = this.multiplication();
		while(true){
			if(matches(TokenList.ADD)){ result = new BinaryNode(result, '+', this.multiplication()); continue; }
			else if(matches(TokenList.SUBTRACT)){ result = new BinaryNode(result, '-', this.multiplication()); continue; }
			break;
		} return result;
	}
	private Statement multiplication() throws Exception{
		Statement result = this.unary();
		while(true){
			if(matches(TokenList.MULTIPLY)){ result = new BinaryNode(result, '*', this.unary()); continue; }
			else if(matches(TokenList.DIVIDE)){ result = new BinaryNode(result, '/', this.unary()); continue; }
			else if(matches(TokenList.MODULO)){ result = new BinaryNode(result, '%', this.unary()); continue; }
			else if(matches(TokenList.POWER)){ result = new BinaryNode(result, '^', this.unary()); continue; }
			break;
		} return result;
	}
	private Statement unary() throws Exception{
		if(this.matches(TokenList.SUBTRACT)){
			return new UnaryNode('-', this.value());
		} return this.value();
	}
	private Statement value() throws Exception{
		Token curr = this.getToken(0);
		if(matches(TokenList.INT)) return new ValueNode(curr.value);
		else if(matches(TokenList.DOUBLE)) return new ValueNode(curr.value);
		else throw new Exception("Неизвестное значение "+this.getToken(0).type.toString()+": "+this.getToken(0).value);
	}
	public boolean matches(TokenList type){
		Token curr_token = this.getToken(0);
		if(curr_token.type != type){ return false; }
		this.position += 1;
		return true;
	} public Token getToken(int rel_pos){
		int curr_position = this.position + rel_pos;
		if(curr_position >= this.size) return new Token(TokenList.EOF, 0);
		return this.tokens.get(curr_position);
	} public Token consume(TokenList type) throws Exception{
		Token curr_token = this.getToken(0);
		if(curr_token.type != type) throw new Exception("Неожиданный токен "+curr_token.value);
		this.position += 1;
		return curr_token;
	}
}
