package da3;
class Vehicle {
	void move(){
		System.out.println("Vehicle moved");
	}
}
class Car extends Vehicle {
	void move(){
		super.move();
		System.out.println("Car moved");
	}
}
class Bike extends Vehicle{
	void move(){
		System.out.println("Bike moved");
	}
}
public class TestBike {
	public static void main(String[] args) {
		Vehicle obj = new Car();
		Vehicle obj1 = new Bike();
		obj.move();
		obj1.move();

	}
}
