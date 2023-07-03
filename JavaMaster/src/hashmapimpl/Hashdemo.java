package hashmapimpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashdemo {
	public static void main(String args[]) {

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		// adding pair into map

		map1.put("pallavi", 12);
		map1.put("sachin", 12);
		map1.put("Sanvi", 12);
		map1.put("Ravi", 12);
		map1.put("amar", 12);
		map1.put("kiran", 120);

		// Adding duplicate key it will overwrite latest value here aman will have value
		// as 18
		map1.put("Aman", 13);
		map1.put("Aman", 12);
		map1.put("Aman", 18);

		map1.put(null, 12);
		map1.put(null, 120);
		map1.put(null, 10000000);

		// get value
		Integer integer = map1.get("Aman");
		System.out.println(integer);

		// If the key is not present in the map, get() returns null.
		Integer val = map1.get("Aman1");

		// add given key-value pair to HashMap if and only if it is not present
		map1.putIfAbsent("five", 5);

		// check whether a particular key/value exist in a HashMap
		System.out.println(map1.containsKey("Aman"));
		System.out.println(map1.containsValue(121));

		// number of key-value mappings present in a HashMap
		System.out.println("size: " + map1.size());

		// remove all key-value pairs from a HashMap
		// map1.clear();

		// Retrieving the Key Set
		Set<String> keyset = map1.keySet();
		System.out.println("Retrieving the Key Set:");
		for (String str : keyset) {
			System.out.println(str);
		}

		// //Retrieving the values present in map
		Collection<Integer> value_set = map1.values();
		System.out.println("Retrieving the value Set:");
		for (Integer i : value_set) {
			System.out.println(i);
		}

		// retrieve all key-value pairs present in a HashMap

		Set<Entry<String, Integer>> entrysets = map1.entrySet();
		System.out.println("Retrieving all the key-value pair:");
		for (Entry<String, Integer> entry : entrysets) {
			System.out.println(entry);
		}

		// remove a key-value pair from the HashMap

		System.out.println("Remove key-value pair:");
		System.out.println(map1.remove("Aman"));

		// printing map

		System.out.println(map1);

	}
}