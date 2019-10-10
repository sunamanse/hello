package com.yedam.example2;

import com.yedam.example2.Hktire;
import com.yedam.Example.HankookTire;
import com.yedam.Example.KumhoTire;

public class HktireExample {
	public static void main(String[] args) {
		Hktire hk = new Hktire(null, 0);
		for (int i = 0; i < 10; i++) {
			int problemLocation = hk.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국ㅌ타이어로 ");
				hk.tireary[0] = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 금호 타이어로");
				hk.tireary[1] = new KumhoTire("앞오른쪽", 17);
				break;
			case 3:
				System.out.println("뒷 왼쪽 한타로");
				hk.tireary[2] = new HankookTire("뒷왼쪽", 16);
				break;
			case 4:
				System.out.println("뒷 오른 금타로");
				hk.tireary[3] = new KumhoTire("뒷오른", 15);
				break;
			}
			System.out.println("||||||||||||||||||||||||||||||||||||||||||||");

		}

	}


}
