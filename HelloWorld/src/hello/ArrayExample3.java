package hello;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] ary = new int[2][];
		ary[0] = new int[3];
		ary[1] = new int[4];
		int a = 8;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = a++;
			}
			int sum = 0;
			for (int aary : ary[i]) {
				sum = sum + aary;
			}
			System.out.println("=> ary[" + i + "]=> 합 :" + sum);
		}
		// for(int i =0; i<ary.length; i++) {
		// for(int j =0; j<ary[i].length; j++) {
		// System.out.printf("%2d", ary[i][j]);

		// }
		// System.out.println();
		// }
	}
}
