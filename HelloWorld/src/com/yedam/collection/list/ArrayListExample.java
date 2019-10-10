package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("bad");
		list.add("nn");
		list.add(2,"insert");
		int size = list.size();
		System.out.println(size);
		
		for(int i =0; i<size; i++) {
			System.out.println(list.get(i));
		}
		String returnval = list.remove(2);
			System.out.println("2"+returnval);
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
	}

}