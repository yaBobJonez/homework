package AdvancedCalculator;

public class Token {
	public TokenList type;
	public double value;
	public Token(TokenList type, double value) {
		this.type = type;
		this.value = value;
	}
	public String toString(){
		return "Token["+this.type.toString()+": "+this.value+"]";
	}
}
