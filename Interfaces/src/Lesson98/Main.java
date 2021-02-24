package Lesson98;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.process();
        Phone ph1 = new Phone();
        Phone ph2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Computer[] cArr = {c1, c2, m1};
        Phone[] phArr = {ph1, ph2, m2.newPhone()};
        for(Computer c : cArr) c.process();
        for(Phone ph : phArr) ph.process();
    }
}
