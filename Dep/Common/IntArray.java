package Common;

import java.util.ArrayList;
import java.util.List;

public class IntArray implements Array<Integer> {
	private List<Integer> storage = new ArrayList<>();
	public IntArray(int... values) {
		for(int value : values) this.storage.add(value);
	}
	@Override
	public Integer get(int index) {
		if(index < this.storage.size()) return this.storage.get(index);
		return null;
	}
	@Override
	public void add(Integer... values) {
		for(int value : values) this.storage.add(value);
	}
	@Override
	public void set(int index, Integer value) {
		this.storage.set(index, value);
	}
	@Override
	public void remove(int index) {
		if(index < this.storage.size()) this.storage.remove(index);
	}
	public static IntArray of(int... values){ return new IntArray(values); }
	@Override
	public String toString() {
		return this.storage.toString();
	}
}