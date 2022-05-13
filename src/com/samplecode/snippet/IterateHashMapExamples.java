package com.samplecode.snippet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMapExamples {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Emilia", "Clarke");
		map.put("Benedict", "Cumberbatch");
		map.put("Peter", null);
		map.put("Tom", "Holland");
		map.put("Scarlett", "Johansson");
		map.put("Robert", "DowneyJr");
		map.put("Elizabeth", "Olsen");
		
		System.out.println("\n\nITERATE USING entrySet()");
		//ITERATE USING entrySet()
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry); //here we can use entry.getKey() and entry.getValue()
		}
		
		System.out.println("\n\nITERATE USING keySet() & values()");
		//ITERATE USING keySet() & values()
		for(String s : map.keySet())
			System.out.println(s);
		
		for(String s : map.values())
			System.out.println(s);
		
		System.out.println("\n\nITERATE USING entrySet().iterator()");
		//ITERATE USING entrySet().iterator()
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println(entry);
		}
		
		System.out.println("\n\nITERATE USING forEach() -- Lambda");
		//ITERATE USING forEach() -- Lambda
		map.forEach((key,value) -> System.out.println(key + "->" + value));
		
		System.out.println("\n\nITERATE USING streamAPI");
		//ITERATE USING streamAPI
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + "=>" + e.getValue()));
		map.entrySet().stream().forEach(System.out::println);

	}

}
