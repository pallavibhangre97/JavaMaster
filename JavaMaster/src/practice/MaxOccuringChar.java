package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringChar {

	public static void main(String[] args) {
		System.out.println(MaxChar("aabsvcgghhh"));

	}

	private static char MaxChar(String string) {

		HashMap<Character, Integer> map = new LinkedHashMap<>();
		int max = 0;
		char maxch = ' ';

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue() >= max) {
				max = entry.getValue();
				maxch = entry.getKey();

			}

		}
		return maxch;

	}

}
