package com.yedam;
class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
		
	}
}
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus(); //참고하는 인스턴스에 따라 결과값 달라짐
		vehicle = new Taxi();
		driver.drive(vehicle);
	}
}
