package Common;

interface Array<T> {
	public T get(int index);
	@SuppressWarnings("unchecked")
	public void add(T... values);
	public void set(int index, T value);
	public void remove(int index);
	public String toString();
}