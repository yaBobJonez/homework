package PW3_17Task1;

import java.io.IOException;

public class Solution{
    public static void main(String[] args) throws Exception{
        try{ int a = 33/0; }
        catch(ArithmeticException e) {
            System.err.println(e);
        }
    }
}
