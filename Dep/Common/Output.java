package Common;

public class Output {
	public static String LF = System.lineSeparator();
	public static void print(Object msg){
		System.out.println(msg.toString());
	} public static void print(Object... msg){
		for(Object val : msg) System.out.println(val);
	}
	public static void printA(Object msg){
		System.out.print(msg.toString());
	} public static void printA(Object... msg){
		for(Object val : msg) System.out.print(val);
	}
}