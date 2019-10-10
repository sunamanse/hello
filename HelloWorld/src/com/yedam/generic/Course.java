package com.yedam.generic;

public class Course<T> {
	private String name; // 과정명
	private T[] students; // T배열은 t에 뭐 들어갈애들로 배열만들거임

	public Course(String name, int capacity) { // capacity 는 배열에 담을 학생숫자
		this.name = name;
		students = (T[]) new Object[capacity]; // 다 받을수 있는 오브젝트를 t로 타입변환 new T[capacity] 안됌
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;

			}
		}
	}

}
