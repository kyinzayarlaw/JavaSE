package kzl;

interface Flyable {
	void fly(); 
}

interface Driveable {
	void drive();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Bird Fly");
	}
}
class Aeroplane implements Flyable, Driveable {
	@Override
	public void fly() {
		System.out.println("Aeroplane fly");
	}
	public void drive() {
		System.out.println("Aeroplane Drive");
	}
	}
class Car implements Driveable {
	public void drive() {
		System.out.println("Car drive");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Flyable fliers = new Bird();
		fliers.fly();
		
		fliers = new Aeroplane();
		fliers.fly();
		Driveable drivers = new Aeroplane();
		drivers.drive();
		
		drivers = new Car();
		drivers.drive();
	}
}
