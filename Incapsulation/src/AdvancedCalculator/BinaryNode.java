package AdvancedCalculator;

public class BinaryNode implements Statement {
	protected Statement left;
	protected char operator;
	protected Statement right;
	public BinaryNode(Statement left, char operator, Statement right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	@Override
	public double eval() throws Exception {
		double left = this.left.eval();
		double right = this.right.eval();
		switch(this.operator){
			case '+': return left + right;
			case '-': return left - right;
			case '*': return left * right;
			case '/': return left / right;
			case '%': return left % right;
			case '^': return Math.pow(left, right);
			default: throw new Exception("Несуществующий оператор");
		}
	}
}
