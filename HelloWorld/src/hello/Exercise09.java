package hello;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 |5. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				
				System.out.println("학생수 > " );
				studentNum = sc.nextInt();
				 scores  = new int[studentNum];
			} else if (selectNo ==2 ) {
				System.out.println("점수 > " );
				for (int i = 0; i <scores.length; i++) {
					scores[i] = sc.nextInt();
					
				}
				
			} else if (selectNo == 3 ) {
				System.out.println();
				
			} else if (selectNo == 4 ) {
				
			} else if (selectNo == 5 ) {
				run = false;
				
			}
	 	
		}
		System.out.println("프로그램 종료");
	}

}
