package PW3_17Task2;

import java.io.IOException;

public class Solution{
    public static void main(String[] args) throws Exception {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e){
            System.err.println(e);
        }
    }
}
