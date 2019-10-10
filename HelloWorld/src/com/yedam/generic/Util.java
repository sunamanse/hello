package com.yedam.generic;

public class Util {//첫번재 <T> 는 T 가 제네릭 타입임을 알려주는 것
	public static <T> Box<T> boxing (T t) { //박싱 메소드 매개값으로 제너릭 타입을 받음 리턴 타입도 박스제네릭 타입임
		Box<T> box = new Box<T>();
		box.setObj(t);//매개값으로 받을 t
		return box;
	}
	
	public static <K, V> boolean compare (Pair<K,V> p1, Pair<K, V> p2) {
		boolean bol1 = p1.getKey().equals(p2.getKey());
		boolean bol2 = p1.getValue().equals(p2.getValue());
		return bol1 && bol2;
		
	}
	
	public static <K, V> boolean compareValue (Pair<K, V> p3, Pair<K,V> p4) {
		boolean bol3 = p3.getValue().equals(p4.getValue());
		
		return  bol3;
		
	}
	
	public static Box boxing2(int a) { //
		return null;
	}
					//숫자만 받을거에요
	public static <T extends Number> int compare(T t1, T t2) { //제네릭에 제한을 둠 넘버를 상속하는 하위 클래스만 가능 
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
		
	}
	
	
	
	
	
	
}
