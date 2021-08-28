package Modifiers.pack1;

import static Common.Output.print;

import Modifiers.pack2.Pack2;
import Modifiers.pack2.Parent;

public class Main extends Parent {
	public static void main(String[] args) {
		Pack1 pack1 = new Pack1();
		Pack2 pack2 = new Pack2();
		Parent parent = new Parent();
		Main main = new Main();
		
		print(pack1.x1);
		print(pack1.x2);
		print(pack1.x3);
		//print(pack1.x4);
		
		print(pack2.x1);
		//print(pack2.x2);
		//print(pack2.x3);
		//print(pack2.x4);
		
		print(parent.x1);
		//print(parent.x2);
		//print(parent.x3);
		//print(parent.x4);
		
		print(main.x1);
		print(main.x2);
		//print(main.x3);
		//print(main.x4);
	}
}
