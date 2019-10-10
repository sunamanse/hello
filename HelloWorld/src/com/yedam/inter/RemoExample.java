package com.yedam.inter;

public class RemoExample {
	public static void main(String[] args) {
		RemoCon rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("================================");
		rc .new Audio();
		rc  .turnOn();
		rc . setVolume(12); 
		rc.turnOff();
		
		
		
		RemoCon rc1 = new RemoCon() {
			int volume;
		
		@Override
		public void turnOn() {
		System.out.println("익명구현객체 켭켜");
		}
		@Override
		public void turnOff {
			System.out.println("익명어쩌꾸 끕 꺼");
		}
		
		@Override
		public setVolume(int Volume) {
			this.volume =volume;
			
		}
			
	};
		
		
	}
}
