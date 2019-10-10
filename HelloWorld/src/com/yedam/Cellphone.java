package com.yedam;

public class Cellphone {
	String model;
	String color;

	public Cellphone() {
		super();
	}

	public Cellphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원 on");
	}

	void powerOff() {
		System.out.println("off");
	}

	void bell() {
		System.out.println("ringdingdong");
	}

	void hangup() {
		System.out.println("전화 끊어");
	}
}
