package classes;

public class Car {//car=객체

	//객체에 대한 속성 = 필드
	
	String model;
	String color;
	int price;
	int maxSpeed;
	
	//기능 = 메소드
	void drive() {
		System.out.println("run at" + maxSpeed);
	} void stop() {
		System.out.println("멈춰");
	}
	
}
	
