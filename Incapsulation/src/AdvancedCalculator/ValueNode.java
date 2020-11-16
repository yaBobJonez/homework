package AdvancedCalculator;

public class ValueNode implements Statement {
	protected double value;
	public ValueNode(double value) {
		this.value = value;
	} public ValueNode(int value) {
		this.value = (double)value;
	}
	@Override
	public double eval() throws Exception {
		return this.value;
	}
}
