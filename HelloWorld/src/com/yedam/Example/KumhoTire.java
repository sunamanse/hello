package com.yedam.Example;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	
	
	
	@Override

	public boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + "금호 타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "타이어 펑");
			return false;
		}

	}
}
