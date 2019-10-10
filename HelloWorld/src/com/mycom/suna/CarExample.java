package com.mycom.suna;

public class CarExample {
	public static void main(String[] args) {
//		//car 클래스에 생성자 선언 후는 사용 x
//		// Car mycar = new Car(); //Car 클래스 필드 사용위해 mycar 객체 생성
//		Car mycar = new Car("검정",3000); //car클래스 생성자 선언 후는 생성자 선언에 사용한 매개변수에 해당하는 매개값을 써줘야함
//				
//		System.out.println("제작 회사: " + mycar.company);
//		System.out.println("모델명 : " + mycar.model);
//		System.out.println("color : " +mycar.color);
//		System.out.println("maxspeed : " + mycar.maxSpeed);
//		System.out.println("speed: " + mycar.speed);
//		
//		mycar.speed = 60;
//		System.out.println("수정 된 속도 : " + mycar.speed);
//		
		
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model :" + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model :" + car3.model);
		System.out.println("car3.color :" + car3.color);
		System.out.println();
		
		Car car4 = new Car("taxi","검정",200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model :" + car4.model);
		System.out.println("car4.color :" + car4.color);
		System.out.println("car4.maxSpeed :" + car4.maxSpeed);
		
		
		
	}
}
