package VarArgs_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        execute();
        execute("Яблоко", "Томат", "Лис", "Кот", "Дерево");
    }
    static void execute(String... strings){
        System.out.println( "Список"+(strings.length==0?".":": "+Arrays.asList(strings)+".") );
    }
}
