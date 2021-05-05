package Serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Engine implements Serializable {
	int power;
	String manufacture;
	public Engine(int power, String manufacture) {
		this.power = power;
		this.manufacture = manufacture;
	}
	@Override
	public String toString() {
		return "Engine{power = " + power + "; manufacture = " + manufacture + "}";
	}
}
