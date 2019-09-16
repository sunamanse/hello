package hello;

public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for (i=1; i<=10; i++) {
			if (i%2==0)
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합:" + sum );
	}
}
