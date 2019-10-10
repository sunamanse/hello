package com.yedam.Example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국ㅌ타이어로 ");
				car.frontLeft = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 금호 타이어로");
				car.frontRight = new KumhoTire("앞오른쪽", 17);
				break;
			case 3:
				System.out.println("뒷 왼쪽 한타로");
				car.backLeft = new HankookTire("뒷왼쪽", 16);
				break;
			case 4:
				System.out.println("뒷 오른 금타로");
				car.backRight = new KumhoTire("뒷오른", 15);
				break;
			}
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");

		}

	}

}
