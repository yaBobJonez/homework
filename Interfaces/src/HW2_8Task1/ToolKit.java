package HW2_8Task1;

import java.util.ArrayList;
import java.util.Random;

public class ToolKit {
	private ArrayList<String> tools = new ArrayList<>();
	public ToolKit(String... tools) {
		for(String tool : tools) {
			this.tools.add(tool);
		}
	}
	public String getRandom(){
		int n = new Random().nextInt(this.tools.size());
		return this.tools.get(n);
	}
	public String get(int index){
		return this.tools.get(index);
	}
}
