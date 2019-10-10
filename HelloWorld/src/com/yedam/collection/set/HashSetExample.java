package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<Member> mem = new HashSet<>();
		mem.add(new Member("조선아씨",24));
		mem.add(new Member("조선아씨",24));
		System.out.println("mem 객체 수 : " + mem.size());
		
			for(Member m : mem) {
				System.out.println(m.name + "/" + m.age);
				
			}
		
		
		Set<String> set = new HashSet<>();
		set.add("hi");
		set.add("w");
		set.add("e");
		set.add("java");
		set.add("rewfa");
		System.out.println(set.size());
		
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("반복자 소진 후");
		iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("확장 for");
		for (String s : set) {
			System.out.println(s);
			
		}
		
		
		
		
	}
}