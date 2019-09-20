package classes;

import java.util.Scanner;

public class Oman {
	public static void main(String[] args) {
		
		int money = 567580; //총금액
		int[] res = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int a = 0;
		int b = 0;
		int [] y = new int[10] ;
		
	
		for(int i=0; i< res.length; i++) {
			y[i] = money / res[i];
		 a = money /res[i];
		 b = money % res[i];
		 System.out.println(res[i] + "원" + y[i]);
		 money =b;
	
		}
	}
}

