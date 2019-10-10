package com.yedam.generic;

public class Person {
	private String name;

	public Person(String name) { //우클릭->소스 -> 유징필드 = 생성자 만들기 
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name ;
	}
	
}
