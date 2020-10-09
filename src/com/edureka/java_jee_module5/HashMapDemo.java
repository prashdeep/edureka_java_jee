package com.edureka.java_jee_module5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 1);
		map.put("five", 5);
		//map.put("five", 10);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		
		System.out.println(map.keySet());
		
		System.out.println("Map contains key => "+ map.containsKey("two"));
		System.out.println("Map contains value => " + map.containsValue(15));
		
		//ways to iterate through the values
		/*Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());;
		}*/
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Integer>> entries = entrySet.iterator();
		
		while(entries.hasNext()) {
			Entry<String, Integer> entry = entries.next();
			System.out.println("Key : "+entry.getKey()+ " Value : "+entry.getValue());
		}
	}

}
