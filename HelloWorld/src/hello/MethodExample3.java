package hello;

public class MethodExample3 {
	public static void main(String[] args) {

		// printStar(5);
		int[] ary = showArray(1, 2, 3, 4, 5, 6);
		for (int i = 0; i < ary.length; i++) {
			//System.out.println(ary[i]);
		}
		for (int a :ary) {
			System.out.println(a);
		}
	}

	public static int[] showArray(int a, int b, int c, int d, int e, int f) {
		int[] ary = { a, b, c, d, e, f };
		return ary;
	}

//	public static void printStar(int a) {

//		for (int i = 0; i <= a; i++) {
//			for (int j = a; j > i; j--) {

//				System.out.printf("*");
//			}
//			System.out.println("");

//		}
}
