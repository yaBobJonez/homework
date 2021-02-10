package HW1_7Task1;

public class Main {
	public static void main(String[] args) throws Exception {
		Parallelepiped obj = new Parallelepiped();
		System.out.println("Площадь основы: " + obj.calculateSurfaceArea('x', 'z'));
		System.out.println("Объём: " + obj.calculateVolume());
	}
}
