package HW2_8Task1;

public class Paramedic extends Worker {
	protected final ToolKit tools = new ToolKit("syringe", "jumpbag", "Tyresnol", "Morphismer", "stretcher", "CRP-test", "Band-help");
	@Override
	void work() {
		System.out.println("A paramedic is using a " + this.tools.getRandom() + "...");
	}
}
