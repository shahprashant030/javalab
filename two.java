package lab_programs;
abstract class Vehicle{
	String fuel;

	public Vehicle(String fuel) {
		this.fuel = fuel;
	}
	public void fuelStatus(String vehicle){
		System.out.println("This "+vehicle+"\'s fuel tank is "+fuel);
	}
	abstract void topSpeed();
}
class Car extends Vehicle{
	int speed;
	public Car(String fuel,int carSpeed) {
		super(fuel);	
		speed=carSpeed;
	}

		void topSpeed() {
System.out.println("Car runs at "+speed+" Km/Hr top speed");
	}
}
class Bike extends Vehicle{
	int speed;
	public Bike(String fuel,int bikeSpeed) {
		super(fuel);	
		speed=bikeSpeed;
	}

		void topSpeed() {
System.out.println("Bike runs at "+speed+" Km/Hr top speed");
	}
}

public class two {
	public static void main(String[] args) {
		Car car=new Car("FULL",150);
		car.fuelStatus("CAR");
		car.topSpeed();
		System.out.println("\n");
		Bike bike=new Bike("HALF",100);
		bike.fuelStatus("BIKE");
		bike.topSpeed();
	}
}
