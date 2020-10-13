package SharedUtils;

import java.util.Scanner;

public class Utils {
    public static Value input(String msg){
        if(msg != null) System.out.println(msg);
        return new StringValue(new Scanner(System.in).nextLine());
    }
    public static String concat(Value... values){
        return "TODO";
    }
}
