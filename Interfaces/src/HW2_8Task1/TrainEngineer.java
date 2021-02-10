package HW2_8Task1;

public class TrainEngineer extends Worker {
	protected final ToolKit tools = new ToolKit("compressor", "speed control", "brakes", "door button", "switch");
	@Override
	void work() {
		System.out.println("A train engineer is using a " + this.tools.getRandom() + "...");
	}
}
