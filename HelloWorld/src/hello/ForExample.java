package hello;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);
		
		sum = 3;
		for (int i = 1; i <= 9; i++) {
			sum = sum * i; }
		System.out.println(sum);
		}
}


