package com.yedam.Example;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽", 6); // 필드 자체가 클래스의 인스턴스
	Tire frontRight = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backRight = new Tire("뒤오른쪽", 4);

	int run() {
		System.out.println("뛰뛰");
		if (frontLeft.roll() == false) {// false==타이어 펑
			stop();
			return 1; // 왼쪽 앞바퀴 문제 발생 = 1값 내보낼거임
		} else if (frontRight.roll() == false) {
			stop();
			return 2;
		} else if (backLeft.roll() == false) {
			stop();
			return 3;
		} else if (backRight.roll() == false) {
			stop();
			return 4;

		}
		return 0;
	}

	void stop() {
		System.out.println("뛰뛰 멈춰");

	}
}
