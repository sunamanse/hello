package com.yedam.example2;

import com.yedam.Example.Tire;

public class Hktire extends Tire {

	public Hktire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	Tire[] tireary = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), 
			new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	int run() {
			System.out.println("뛰뛰");
			
		for(int i =0; i < tireary.length; i++) {
				if (tireary[i].roll() == false) {
			stop();
				return 1+1; 
		}
		
	}
		return 0;
	

}

	void stop() {
		System.out.println("뛰뛰 멈춰");

	}

}
