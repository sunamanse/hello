package hello;

public class Exercise08_5 {
	public static void main(String[] args) {
		int[][] ary= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
				
		};
		int sum =0;
		double avg =0.0;
		int cnt = 0;
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				cnt++;
				sum += ary[i][j];
				avg = (double)sum/cnt;
			}
			
		} System.out.println("sum : " + sum);
		  System.out.println("avg : " + avg);
	}
}
