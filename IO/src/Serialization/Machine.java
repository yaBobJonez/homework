package Serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Machine implements Serializable{
	int weight = 160;
	public Machine(int weight) {
		this.weight = weight;
	}
	public Machine() {
	}
	@Override
	public String toString() {
		return "Machine(" + weight + ")";
	}
}
