package com.BridgeLabs.Hashmap;

public class MyHashMapTest {
	public static void main(String[] args) {

		String a = "To be or not to be";
		a = a.toLowerCase();
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		String[] words = a.split(" ");
		for (String string : words) {
			Integer val = hashMap.get(string);
			if (val == null)
				val = 1;
			else
				val = val + 1;
			hashMap.add(string, val);

		}
		System.out.println(hashMap);


//		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
//		hashMap.add("1", 12345);
//		hashMap.add("34", 1234);
//		System.out.println(hashMap);

	}
}
