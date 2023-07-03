package eiqlevel2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String string = "puffu";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		char maxChar = ' ';
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		/*
		 * Collection<Integer> collection = map.values(); for (Integer i : collection) {
		 * if (i > max) max = i; if (i == max) { max = 0; break;
		 * 
		 * } }
		 */
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxChar = entry.getKey();
			} else {
				if (entry.getValue() == max) {
					maxChar = '0';

				}
			}
		}
		String bString = Character.toString(maxChar);
		System.out.println(map);
		System.out.println("max occuring char :" + bString);

	}
}
