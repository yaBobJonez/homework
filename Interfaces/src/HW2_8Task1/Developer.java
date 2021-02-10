package HW2_8Task1;

public class Developer extends Worker {
	protected final ToolKit tools = new ToolKit("Sunset IDE", "JUnited", "JacketFX", "SquareCI");
	@Override
	void work() {
		System.out.println("A developer is using " + this.tools.getRandom() + "...");
	}
}
