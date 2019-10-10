package com.yedam.generic;

public class Box<T> {
	private T obj; //오브젝트 타입의 필드 obj 모든 데이터타입 카바 가능 
						//오브젝트는 최상위 클래스라 모든 데이터타입 가능

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}