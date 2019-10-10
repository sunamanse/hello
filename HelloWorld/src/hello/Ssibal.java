package hello;

import java.util.Calendar;
import java.util.Scanner;

public class Ssibal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년, 월 을 입력하세요");
		
		int year = 0;
		int month = 0;
				
		year= sc.nextInt();
		month=sc.nextInt();
		
		getCal(year,month);
		
	}
	
	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int cal1 = month-1;
		
//		System.out.println("년 : " + cal.get(Calendar.YEAR));
//		System.out.println("월: " +cal.get(Calendar.MONTH));
//		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일 : "+cal.get(Calendar.DAY_OF_MONTH));
//		
		cal.set(year, cal1,1);
		
		String[] week = {"sun","mon","tue","wed","thr","fri","sat"};
		
		int monthday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("    <<" + month + "월달>>");
		
		for (String str :week) {
			System.out.print(" " + str);
		}
		System.out.println();
		
		for(int i =1; i<sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthday; i++) {
			System.out.printf("%4d", i);
			if ((sDay+i-1)%7 == 0)
				System.out.println();
		}	
		
	}
}
