package PW5_19Tasks;

public class Main2 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4};
        int[] b = new int[]{2, 4};
        System.out.println(a==b); //Создав несколько инстанций в разных ячейках памяти, они имеют разные адреса:
        System.out.println(a.hashCode()+" "+b.hashCode());
        System.out.println(a.equals(b));
    }
}
