package PW5_18Task1;

public class Main1 {
    public static void main(String[] args) {
        String str = "ThunderClan";
        StringBuffer buffer = new StringBuffer(str);
        buffer.replace(0, buffer.length(), "ShadowClan");
        buffer.reverse(); buffer.reverse();
        buffer.append(" has a new dark leader");
        buffer.append("<...>");
        System.out.println( buffer.toString() );
    }
}
