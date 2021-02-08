package HW2_8Task1;

public class Firefighter extends Worker {
	protected final ToolKit tools = new ToolKit("fire extinguisher", "supply line", "¼” attack line", "fire axe", "SCBA");
	@Override
	void work() {
		System.out.println("A firefighter is using a " + this.tools.getRandom() + "...");
	}
}
