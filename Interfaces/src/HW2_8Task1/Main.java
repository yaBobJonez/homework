package HW2_8Task1;

public class Main {
	public static void main(String[] args) {
		//Названия инструментов некоторых я немного изменил C:
		new Developer().work();
		new Paramedic().work();
		new Firefighter().work();
		new TrainEngineer().work();
		new Teacher().work();
		//Анонимный внутренний тип:
		new Worker() {
			protected final ToolKit tools = new ToolKit("plow/plough", "seeding machine", "harvester");
			@Override
			void work() {
				System.out.println("A farmer is using a " + this.tools.getRandom() + "...");
			}
		}.work();
	}
}
