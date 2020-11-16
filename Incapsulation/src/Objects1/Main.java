package Objects1;

public class Main {
    public static void main(String[] args) {
        Engine eng = new Engine("VLM", 200);
        Wheel wh1 = new Wheel("W", "TCM", 14);
        Wheel wh2 = new Wheel("W", "TCM", 14);
        Wheel wh3 = new Wheel("W", "TCM", 14);
        Wheel wh4 = new Wheel("W", "TCM", 14);
        Car car = new Car(eng, new Wheel[]{wh1, wh2, wh3, wh4}, 50, 4, 5);
    }
}
