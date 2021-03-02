package ExceptionsOrder;

public class Main {
    static int a = 25, b = 0;
    static int[] c = {6, 2, 1};
    static boolean traceOut = false;
    public static void main(String[] args) {
        try {
            System.out.println(c[95]);
            System.out.println(a / b);
        } catch(ArithmeticException e){
            System.out.println("Ошибка: " + e.getClass().getCanonicalName());
            if(traceOut) for(StackTraceElement el : e.getStackTrace()) System.out.println("\n" + el);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: " + e.getClass().getCanonicalName());
            if(traceOut) for(StackTraceElement el : e.getStackTrace()) System.out.println("\n" + el);
        }
    }
}
