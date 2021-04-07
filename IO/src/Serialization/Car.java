package Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Car implements Serializable{
	int price;
	String model;
	transient Engine engine;
	Machine machine;
	public Car(int price, String model, Engine engine, Machine machine) {
		this.price = price;
		this.model = model;
		this.engine = engine;
		this.machine = machine;
	}
	@Override
	public String toString() {
		return "Car{price = " + price + "; model = " + model + "; engine = " + engine + "; machine = " + machine + "}";
	}
	private void writeObject(ObjectOutputStream oOutS) throws IOException{
		oOutS.defaultWriteObject();
		oOutS.writeInt(engine.power);
		oOutS.writeBytes(engine.manufacture);
	}
	private void readObject(ObjectInputStream oInS) throws ClassNotFoundException, IOException{
		oInS.defaultReadObject();
		this.engine = new Engine( oInS.readInt(), String.valueOf(oInS.readAllBytes()) );
	}
}
