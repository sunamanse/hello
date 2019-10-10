package com.mycom.suna;

public class Car {
	
	Car() {	}
	
	String company = "현대";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	Car(String model) {
		this(model,"은색",250);		
	}
	
	Car(String model, String color) {
		this(model , color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
}