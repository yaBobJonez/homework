package String_02;

public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        System.out.println((buffer.length()==0)?"Пустой":"Не пустой");
        System.out.println("Вместимость: "+buffer.capacity());
        buffer.append("Java");
        System.out.println(buffer.toString());
        System.out.println("Длина: "+buffer.length());
        System.out.println("Вместимость: "+buffer.capacity());
        System.out.println("\uD83D\uDD04: "+buffer.reverse().toString());
        System.out.println("✂️(0, 2): "+buffer.substring(0, 2));
    }
}
