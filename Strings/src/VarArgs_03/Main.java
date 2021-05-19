package VarArgs_03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        execute(2, "First");
        execute(4, "Second", "Third", "Forth");
    }
    static void execute(int num, String... strings){
        System.out.println(num);
        System.out.println( "Список"+(strings.length==0?".":": "+ Arrays.asList(strings)+".") );
    }
}
