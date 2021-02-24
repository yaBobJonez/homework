package PW2_24Task1;

public class Main {
    public static void main(String[] args) {
        Developer[] d = {
             new Developer(),
             new Developer(),
             new Developer(),
             new Person()
        }; Student[] s = {
             new Student(),
             new Student(),
             new Student(),
             new Person().newStudent()
        };
        for(Developer dev : d) dev.whatAreYouDoing();
        for(Student st : s) st.whatAreYouDoing();
    }
}
