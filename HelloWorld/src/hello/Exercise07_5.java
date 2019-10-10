package hello;

public class Exercise07_5 {
	public static void main(String[] args) {
		
		int[] ary = {1,5,3,8,2};
		int max = 0;
		
		for(int i = 0; i <ary.length; i++) {
			if(max<ary[i]) {
				max=ary[i];
			}
			
			
			
		}System.out.println("max : " + max);
		
	}
}
