package hello;

import java.util.Scanner;

public class GetMaxvalue {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 
	 
	 int [] scores = new int[5] ;
		
		for(int i=0; i <scores.length;i++){
			System.out.println("정수값 입력 :");
			scores[i] = sc.nextInt();
		}
			int maxvalue = 0;
			for (int i=0; i<scores.length; i++) {
				maxvalue = (maxvalue > scores[i] ? maxvalue : scores[i]);
			}
			System.out.println("제일 큰 값은:" + maxvalue);
			
	
			
	}
}
