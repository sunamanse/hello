package hello;

import java.util.Scanner;

public class Exercise09_5 {
	public static void main(String[] args) {
		
		boolean run = true;
		int stuNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("===========================");
			System.out.println("1.학생수 || 2.점수입력||3.점수리스트||4.분석||5.종료");
			System.out.println("===========================");
			System.out.println("선택 > ");
			
			int selno = sc.nextInt();
			
			if (selno == 1) {
				System.out.println("학생수를 입력하세요");
				stuNum = sc.nextInt();
				scores = new int[stuNum];
				
		}else if (selno == 2) {
				System.out.println("점수를 입력하세요");
				for(int i =0; i<scores.length; i++) {
					System.out.println("학생["+(i+1)+"] :" );
					scores[i] =sc.nextInt();
				}	
		} else if (selno == 3) {
			System.out.println("점수리스트를 출력합니다");
			for(int i =0; i<scores.length; i++) {
			System.out.println("학생[" + (i+1) + "] :" + scores[i]);
			}
		}else if (selno ==4) {
			int max = 0;
			int sum = 0;
			double avg = 0;
			int cnt = 0;
			for(int i = 0; i<scores.length; i++) {
				cnt++;
				sum += scores[i];
				avg = (double)sum/cnt;
				System.out.println("sum : " + sum);
				System.out.println("avg : "+ avg);
			}
		
			}
			}

			
			
	}
}
