package com.yedam.abstranctPkg;

public abstract class Animal { //추클
	public String kind;
	public void breathe() {
		System.out.println("숨쉼");
	}
	
	public abstract void sound(); //추상메소드
	
}

class Cat extends Animal {
	
	@Override
	public void sound() { //추클의 추메 선언 //추메라 새 클래스에서 할때마다 재정의 해야함
		System.out.println("먀옹");
	}
	
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("왈왈");
	}
}
