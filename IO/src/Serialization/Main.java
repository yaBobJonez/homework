package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File(Main.class.getResource("file1.jser").getPath());
		Car car = new Car(17800, "Nyommer", new Engine(8, "MEW"), new Machine());
		car.machine.weight = 120;
		ObjectOutputStream oOutS = new ObjectOutputStream(new FileOutputStream(f));
		oOutS.writeObject(car);
		oOutS.flush();
		oOutS.close();
		System.out.println(f.getPath());
		ObjectInputStream oInS = new ObjectInputStream(new FileInputStream(f));
		Car deserializedCar = (Car)oInS.readObject();
		oInS.close();
		System.out.println(deserializedCar);
	}
}
