package PW3_17Task4;

import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static void main(String[] args) throws Exception{
        try {
            List<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch(IndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
