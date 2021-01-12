package HW1_7Task1;

public class Parallelepiped {
	public int x, y, z;
	public Parallelepiped(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Parallelepiped() {
		this(4, 2, 3);
	}
	int calculateSurfaceArea(char side1, char side2) throws Exception{
		if(!"xyz".contains(String.valueOf(side1)) || !"xyz".contains(String.valueOf(side2))) {
			throw new UnavailableSurface(side1, side2);
		}
		return getClass().getField(String.valueOf(side1)).getInt(this) *
				getClass().getField(String.valueOf(side2)).getInt(this);
	}
	int calculateVolume(){
		return this.x * this.y * this.z;
	}
	
	@SuppressWarnings("serial")
	private class UnavailableSurface extends Exception {
		public UnavailableSurface(char side1, char side2) {
			System.err.println("Несуществующая грань " + String.valueOf(side1).toUpperCase() + String.valueOf(side2).toUpperCase() + ":");
			for(StackTraceElement e : super.getStackTrace()) System.err.println("\t" + e);
			System.exit(1);
		}
	}
}
