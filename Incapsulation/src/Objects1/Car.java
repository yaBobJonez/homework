package Objects1;

import java.io.Serializable;

public class Car implements Serializable {
    public String model;
    public String manufacturer;
    public String color;
    int speed;
    int acceleration;
    int braking;
    protected int age;
    public double price;
    Engine engine;
    Wheel[] wheels;
    public Car(Engine engine, Wheel[] wheels, int speed, int acceleration, int braking) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.braking = braking;
        this.engine = engine;
        this.wheels = wheels;
    }
    public Car(Engine engine, Wheel[] wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void move(){}
}
