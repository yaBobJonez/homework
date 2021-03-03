package Exception5;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch(Exception e){
            /*
             * 1. Запускаеться method1(),
             * 1.1. Выберается рандомное число 0..2
             * 2. Если число =
             *   0: вызвать Exception3, который наследует 2, который наследует 1, который наследует просто Exception;
             *   1: вызвать Exception2, который наследует 1, который наследует просто Exception;
             *   2: вызвать Exception1, который наследует просто Exception;
             * 3. Вывести название класса этого исключения
             */
            System.out.println(e);
        }
    }
    public static void method1() throws Exception1, Exception2, Exception3{
        int i = (int) (Math.random() * 3);
        if (i == 0) throw new Exception3();
        if (i == 1) throw new Exception2();
        if (i == 2)throw new Exception1();
    }
}
class Exception1 extends Exception{}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}


