package HomeworkMVC;

public class Controller {
	public Model processVolume(Model model){
		model.volume = model.w * model.l * model.h;
		return model;
	}
}
