package classes;

public class Calculator {
	double plus(double x, double y) {
		return x + y;
		}

	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double avg(int a, int b) {
		int sum = plus(a, b);
		double result = (double)sum / 2;
		return result;

	}

	void execute() {
		int a = 10, b = 20;
		double result = avg(a, b);
		println("result: " + result);
	}

	void println(String str) {
		System.out.println(str);

	}
}
