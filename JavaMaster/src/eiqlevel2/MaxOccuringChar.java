package eiqlevel2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String string = "ppuff";
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int max = 0;
		char maxChar = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//		for (Entry<Character, Integer> entry : entrySet) {
//			if (entry.getValue() > max) {
//				max = entry.getValue();
//				maxChar = entry.getKey();
//			} else {
//				if (entry.getValue() == max) {
//					maxChar = '0';
//
//				}
//			}
//		}
//		String bString = Character.toString(maxChar);
//		System.out.println(map);
//		System.out.println("max occuring char :" + maxChar);

		List<Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				if (o1.getValue() == o2.getValue()) {
					return 0;
				} else if (o1.getValue() < o2.getValue()) {
					return 1;
				} else {
					return -1;
				}

			}
		});

		System.out.println(list.get(0));
	}
}
