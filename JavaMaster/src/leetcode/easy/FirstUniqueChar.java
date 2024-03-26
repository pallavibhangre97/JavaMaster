package leetcode.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String str = "aabb";

		int c = firstChar(str);
		System.out.println(c);
	}

	private static int firstChar(String str) {
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue() == 1) {
				c = entry.getKey();
				break;
			}
		}
		return str.indexOf(c, 0);
	}

}
