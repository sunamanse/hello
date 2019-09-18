package hello;

import java.util.Scanner;

public class MethodExample2 {
	
	public static void menu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 |5. 종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택> ");
	}
	
	public static int[] menu2(int[]ary) {
		Scanner sc = new Scanner(System.in);
		int[] copyAry = new int [ary.length];
		for (int i = 0; i < ary.length; i++) {
			System.out.println("scores[" + i + "]>");
			copyAry[i] = sc.nextInt();
			
		
	}
		return copyAry;
	}
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			menu();

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.println("학생수 > ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				scores = menu2(scores);
					

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}

			} else if (selectNo == 4) {
				int maxValue = 0, sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					maxValue = (maxValue > scores[i] ? maxValue : scores[i]);
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최대값은: " + maxValue);
				System.out.printf("평균: %.3f", avg);
				System.out.println();

			} else if (selectNo == 5) {
				run = false;

			}

		}
		System.out.println("프로그램 종료");
	}

	

	}

