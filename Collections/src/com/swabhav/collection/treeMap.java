package com.swabhav.collection;

import java.util.TreeMap;

public class treeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree=new TreeMap<>();

		//put
		tree.put(1,"sam");
		tree.put(5, "vichaar");
		tree.put(78, "siyaahi");
		
		System.out.println(tree);
		
		//get
		System.out.println(tree.get(5));
		//remove
//		System.out.println(tree.remove(78));
//		System.out.println(tree);
		
		//containsKey
		System.out.println(tree.containsKey(78));
		System.out.println(tree.containsValue("sam"));
		
		//firstkey
		System.out.println(tree.firstKey());
		
		//lastkey
		System.out.println(tree.lastKey());
		
		//highkey
		System.out.println(tree.higherKey(1));
		//subMap
		System.out.println(tree.subMap(1, 78));
		//headmap
		System.out.println(tree.headMap(5));
		//tailamp
		System.out.println(tree.tailMap(5));
	}




}
