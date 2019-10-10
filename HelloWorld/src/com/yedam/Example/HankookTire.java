package com.yedam.Example;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override

	public boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + "한국 타이어 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "타이어 펑");
			return false;
		}

	}
}
