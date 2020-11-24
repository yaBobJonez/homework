package Parallelepiped;

public class Evaluator {
	public int area(int l, int w, int h){
		return (l*w + w*h + l*h)*2;
	}
	public int volume(int l, int w, int h){
		return l*w*h;
	}
}
