package com.yedam.abstranctPkg;

public class AniExample {
	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound(); // 추메 사운드
		dog.sound();
		System.out.println("=============================");
		Animal animal = null;
		animal = cat;
		aniSound(animal); 
		animal = dog;
		aniSound(animal);
		
		
	
	
	}
	
	public static void aniSound(Animal animal) {
		animal.sound();
		
	}
	
}
