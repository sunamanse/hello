package hello;

public class Hello {
	public static void main(String[] args) {
		//byte a = 127;
		//a = (byte) (a + 1);
		//System.out.println("result:" + a);
		
		int num1 = 10;
		num1++; //num1 = num1 + 1;
		int a = 5, b = 7;
		num1 = a++ + ++b; // a++ -> a+b +1 , ++b -> 8
		System.out.println(a++ + "," + ++b);
		System.out.println("num1 : " + num1);
	}
}
