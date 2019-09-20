package hello;

public class Sample {//배열복사
	public static void main(String[] args) {
		String [] strAry = {"su","na","man","se"};
		String [] copy = new String[strAry.length];
					//for를 활용한 배열 복사
		//		for(int i=0; i<strAry.length;i++) {
//			copy[i] =strAry[i];	}
		
		//메소드 이용 배열복사 (카피할거,시작자리,카피해서 넣을거,시작위치,문자길이)
		System.arraycopy(strAry, 0, copy, 0, strAry.length);
		for (String str : copy) {
			System.out.println(str);
		
		}	
	}

}
