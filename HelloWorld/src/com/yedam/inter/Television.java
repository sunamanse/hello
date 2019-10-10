package com.yedam.inter;

public class Television implements RemoCon {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("티비 켜");

	}

	@Override
	public void turnOff() {
		System.out.println("티비 꺼");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;

	}

}
