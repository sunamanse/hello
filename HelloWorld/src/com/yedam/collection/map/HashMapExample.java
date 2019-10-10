package com.yedam.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50);
		System.out.println("entry갯수" + map.size());
		System.out.println("방법1");

		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();

		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("key" + key + ",value " + map.get(key));
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mapIter = entrySet.iterator();
		while (mapIter.hasNext()) {
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("key" + ent.getKey() + ", value" + ent.getValue());

		}
		
		for(Map.Entry<String, Integer> mapEnt : entrySet) {
			System.out.println(mapEnt.getKey() + ", " + mapEnt.getValue());
			
		}
	}
}