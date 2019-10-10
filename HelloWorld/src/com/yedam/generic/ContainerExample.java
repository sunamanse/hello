package com.yedam.generic;

public class ContainerExample{
	public static void main(String[] args) {
		Container<String> con1 = new Container<String>();
		con1.setIng("홍길동");
		String str = con1.getIng();
		System.out.println(str);
		
		Container<Integer>con2 = new Container<Integer>();
		con2.setIng(6);
		int val = con2.getIng();
		System.out.println(val);
		
		
	}
}
