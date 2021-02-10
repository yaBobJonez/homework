package HW1_7Task3;

import java.util.ArrayList;
import java.util.List;

public class Car {
	String model;
	int maxSpeed;
	boolean hasHatch;
	
	static List<Car> register = new ArrayList<>();
	static int count = 0;
	
	public Car(String model, int maxSpeed, boolean hasHatch) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.hasHatch = hasHatch;
		this.registerVehicle();
	}
	public Car(String model, int maxSpeed) {
		this(model, maxSpeed, false);
	}
	public Car(int maxSpeed) {
		this("Chevy Camaro 2010", maxSpeed, false);
	}
	public Car(String model) {
		this(model, 155, false);
	}
	public Car() {
		this("Chevy Camaro 2010", 155, false);
	}
	
	private void registerVehicle(){
		Car.register.add(this);
		System.out.println("[i] Зарегестрирован новый автомобиль: " + Car.register.get(Car.count));
		Car.count += 1;
	}
	
	@Override
	public String toString() {
		return "Модель: " + model + ", макс. скорость: " + maxSpeed + ", есть люк: " + (hasHatch?"да":"нет");
	}
}
