package com.yedam.Exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 에러내용 보여줘
		}
		System.out.println("findClass()호출 후"); // 정상 프로그램종료
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = null;
		clazz = Class.forName("java.lang.String2");
		System.out.println(clazz.getName());
	}
}
