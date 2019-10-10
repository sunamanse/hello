package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
//		Pair<String, Integer> p1 = new Pair<> ("apple",10);
//		Pair<String, Integer> p2 = new Pair<> ("apple",10);
//		boolean result = Util.compare(p1, p2);
//		if(result)
//			System.out.println("두 객체 논리적 동일");
//		else 
//			System.out.println("다름");
		
		Pair<String, String> p1 = new Pair<> ("user1","orange");
		Pair<String, String> p2 = new Pair<> ("user1","orange");
		boolean result = Util.compare(p1, p2);
		if(result)
			System.out.println("same");
		else
			System.out.println("no");
			
		Pair<String, Integer> p3 = new Pair<> ("orange", 10);
		Pair<String, Integer> p4 = new Pair<> ("apple", 10);
		boolean result1 = Util.compareValue(p3, p4);
		if(result1)
			System.out.println("same");
		else
			System.out.println("no");
		
		Pair<String, String> p5 = new Pair<> ("orange" , "good");
		Pair<String, String> p6 = new Pair<> ("apple" , "better");
		boolean result2 = Util.compareValue(p5, p6);
		if(result2)
			System.out.println("s");
		else
			System.out.println("n");
				
 		
		Integer intV1 = Util.compare(10, 20);
		System.out.println(intV1);
		
		
				
	}
}
