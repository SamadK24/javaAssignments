package com.swabhav.collection;

import java.util.LinkedHashMap;

public class linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		
		//put method
		map.put(1,"Samad");
		map.put(2,"Akash");
		System.out.println(map);
		
		//putifAbsent
		map.putIfAbsent(3, "Vighnesh");
		System.out.println(map);
		
		//get
		System.out.println(map.get(1));
		
		//remove
		System.out.println(map.remove(3));
		System.out.println(map);
		
		//remove
		System.out.println(map.remove(1, "Samad"));
		System.out.println(map);
		
		//containsKey
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Akash"));
		
		//size
		System.out.println(map.size());
		
		//isEmpty
		System.out.println(map.isEmpty());
		
		//clear deletes all the key-value pair
		
		//keySet
		System.out.println(map.keySet());
		
		//values
		System.out.println(map.values());
		
		//replace
		map.replace(2,"Samad");
		System.out.println(map);
	}

}
