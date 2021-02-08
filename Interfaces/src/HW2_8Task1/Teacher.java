package HW2_8Task1;

public class Teacher extends Worker {
	protected final ToolKit tools = new ToolKit("whiteboard", "black eraser", "pencil", "laser pointer", "pen");
	@Override
	void work() {
		System.out.println("A teacher is using a " + this.tools.getRandom() + "...");
	}
}
