package HomeworkMVC;

public class View {
	public void display(int volume, boolean metric){
		System.out.println("Объём: "+volume+" "+ (metric?"cm²":"in²"));
	}
	public void display(Model model, boolean metric){
		System.out.println("Размер: "+model.w+"×"+model.h+"×"+model.l+" "+ (metric?"cm":"in"));
		System.out.println("Объём: "+model.volume+" "+ (metric?"cm²":"in²"));
	}
}
