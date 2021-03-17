package PW3_17Task3;

public class Solution{
    public static void main(String[] args) throws Exception{
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
