package HomeworkMVC;

public class Main {
	public static void main(String[] args) {
		Model box = new Model(3, 4, 2);
		Controller calc = new Controller();
		box = calc.processVolume(box);
		View view = new View();
		view.display(box, true);
	}
}
