package hello;

public class Singleton {
	private static Singleton sing = new Singleton();
	private Singleton() {}
	static Singleton getInstance() {
		return sing;
				
	}
		
	
	
}
