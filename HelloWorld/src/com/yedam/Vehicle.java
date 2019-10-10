package com.yedam;

import com.yedam.Example.Tire;
class Bus extends Vehicle{

	@Override
	void run() {
		System.out.println("버스 달려");
	}
	

	
}

class Taxi extends Vehicle{
	@Override
	void run() {
		System.out.println("택시달려");
	}
}
public class Vehicle {
	String engine;
	String handle;
	Tire tire;
	
		void start() {
			System.out.println("뛰뛰 출발");
		}
		void run() {
			System.out.println("뛰뛰 달려");
		}
		void stop() {
			System.out.println("뛰뛰 멈춰");
		}




}
