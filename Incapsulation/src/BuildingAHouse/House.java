package BuildingAHouse;

public class House {
	private int area = 160;
	public String color;
	protected Door door = new Door(210);
	{ System.out.println("Создаём дом..."); }
	public House(String color) {
		this.color = color;
	}
	public int getArea(){ return this.area; }
	
	class Door {
		int height;
		public Door(int height) {
			this.height = height;
		}
		@Override
		public String toString() {
			return "Door[height = " + height + "]";
		}
	}
}
