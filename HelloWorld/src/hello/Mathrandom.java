package hello;

import java.util.Scanner;

public class Mathrandom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("????/");
		int mon = sc.nextInt();
		
		
	
		
	}

	public static void showCal(int mon) {
		String[] week = {"sun","mon","tue","wed","thr","fri","sat"};
		int month = mon;
		int monthday = getMonth(month);
		int sDay = getStartday(month);
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

	public static int getStartday(int month) {
		int startday = 0;
		if (month == 9) {
			startday = 1; // 일요일
		} else if (month == 10) {
			startday = 3; // 화
		} else if (month == 11) {
			startday = 6; // 금
		} else if (month == 8) {
			startday = 5; // 목
		}
		return startday;

	}

	public static int getMonth(int monthday) {
		int day = 0;
		if (monthday == 2) {
			day = 28;
		} else if (monthday <= 7 && monthday % 2 == 1) {
			day = 31;
		} else if (monthday >= 8 && monthday % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}

}
