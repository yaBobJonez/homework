package String_01;

public class Main {
    public static void main(String[] args) {
        String s1 = "Перший рядок";
        String s2 = "Другий рядок";
        String s3 = "Третій рядок";
        System.out.println("Length: "+s1.length());
        System.out.println("s1[3]: "+s1.charAt(3));
        if(s1.equals(s2)){
            System.out.println("#1:if");
            System.out.println(s1==s2);
        } else {
            System.out.println("#1:else");
            System.out.println(s1!=s2);
        }
        if(s1.equals(s3)) System.out.println(s1==s3);
        else System.out.println(s1!=s3);
    }
}
