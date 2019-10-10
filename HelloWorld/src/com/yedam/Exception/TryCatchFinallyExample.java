package com.yedam.Exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1" + data1);
			System.out.println("data2" + data2);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개 변수 값 부족");
			System.out.println("매개변수 2개가 필요");

		} finally {
			System.out.println("다시");
		}
		try {
			
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("sum : " + (val1+val2));
	}	catch (NumberFormatException e) {
		System.out.println("숫자변환 ㄴ");
		System.out.println("다시");
	}
		System.out.println("프로그램 종료");

	}

}
