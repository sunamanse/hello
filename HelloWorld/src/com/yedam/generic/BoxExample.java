package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		box.setObj(new String("hello"));
		String str = box.getObj();
		
		Box<Integer> intbox = new Box<Integer>();
		intbox.setObj(10);
		int intValue = intbox.getObj();
		
		
//		box.setObj(new String("hello"));
//		String strValue = (String) box.getObj();
//		System.out.println(strValue);
//		
//		box.setObj(new Integer(10));
//		int intValue =  (int) box.getObj();
//		System.out.println(intValue);
//		
//		box.setObj(new Double(1.1)); //컴파일에서 에러발생 ㄴㄴ->but실행창에서 에러남
//		String newstr = (String) box.getObj(); //더블타입 스트링으로 형변 ㄴㄴ
//		
	}
}
