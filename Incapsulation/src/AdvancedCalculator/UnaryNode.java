package AdvancedCalculator;

public class UnaryNode implements Statement {
	protected char operator;
	protected Statement right;
	public UnaryNode(char operator, Statement right) {
		this.operator = operator;
		this.right = right;
	}
	@Override
	public double eval() throws Exception {
		if(this.operator == '-') return -this.right.eval();
		else throw new Exception("Несуществующий оператор");
	}
}
