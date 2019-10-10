package com.yedam.example2;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {

		int Com[] = new int[3]; // 랜덤숫자
		int User[] = new int[3]; // 시도한 숫자
		int num = 0; // 배열 인덱스
		// int cnt = 0; //몇번째 맞추는지
		boolean run = true;

		int strike = 0;
		int ball = 0;

		// 배열 길이만큼 for 로 난수넣고 중복확인
		for (int i = 0; i < Com.length; i++) {
			Com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (Com[j] == Com[i]) {
					i--;
					break;

				}
			}
		}

		// 유저가 맞출 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9 까지 공번호를 입력하세요 >>");

		// 랜덤숫자 유저숫자 비교 스트라이크, 볼 구분
		run = true;
		while (run) {
			for (int i = 0; i < User.length; i++) {
				num = sc.nextInt();
				User[i] = num;
//				if (num < 0 || num > 10) {
//					System.out.println("1~10 입력 >>");
				// }

			}
			for (int i = 0; i < Com.length; i++) {
				for (int j = 0; j < User.length; j++) {
					if (Com[i] == User[j] && i == j) {
						strike++;

					} else if (Com[i] == User[j] && i != j) {
						ball++;

					}

				}
			}

			System.out.println(strike + "스트라이크" + ball + "볼");
			strike = 0;
			ball = 0;

			if (strike == 3) {
				run = false;
				System.out.println("game over");
			}
		}

		sc.close();
	}
}
