package PW5_19Tasks;

public class Main1 {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("test");
        StringBuilder b2 = new StringBuilder("test");
        System.out.println(b1.toString().equals(b2.toString()));
        //true: значения строк при переводе из классов равны: "test" == "test".
    }
}
