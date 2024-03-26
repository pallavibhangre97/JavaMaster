package hashmapimpl;

import java.util.HashMap;

public class Demo {

	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("pallavi", 1);
		map.put("sasa", 90);
		map.put("paaqwqqqllavi", 4);
		map.put(null, 4);
		map.put(null, 6);
		map.put(null, 4);
		map.put(null, 6);
		map.put(null, 4);
		map.put(null, 6);
		map.put(null, 4);
		map.put(null, 6);
		map.put(null, 4);
		map.put(null, 0);
		map.put("pallavi", 2);
		System.out.println(map);
		System.out.println(map.get(null));
	}
}
