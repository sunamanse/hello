package hello;

public class Bingo {
	public static void main(String[] args) {
	int[][] ary = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},
					{16,17,18,19,20},{21,22,23,24,25}};
	//int[5][5];
	
	for (int j = 4 ; j<ary.length; j--) {
		for (int i = 0; i<ary[j].length; i++) {
			System.out.print("[" + i + "," + j + "=>" + ary[i][j]+"]");
		}
		System.out.println();
	}
	
}
}
