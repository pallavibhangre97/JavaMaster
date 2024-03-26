package comparableandcomparator;

import java.util.Collections;
import java.util.Comparator;
/*
 * get entry set into list then sort by comparator
 * again get all sorted values from list into linkedhashmap so order will maintain 
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashmapByValue {

	public static void main(String args[]) {
		HashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("pallavi", 90);
		map.put("sachin", 23);
		map.put("sagar", 14);
		map.put("sanvi", 70);
		// System.out.println(map);
		sortingByValue(map);
		// sortingByKey(map);
	}

	private static void sortingByKey(HashMap<String, Integer> map) {

		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		Map<String, Integer> sortedmap = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {

			sortedmap.put(entry.getKey(), entry.getValue());
		}

		// print sorted map
		System.out.println(sortedmap);
	}

	private static void sortingByValue(HashMap<String, Integer> map) {
//create list of entry then sort 
		List<Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				if (o1.getValue() == o2.getValue()) {
					return 0;
				} else if (o1.getValue() < o2.getValue()) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		// add all elements of sorted list into hashmap

		Map<String, Integer> sortedmap = new LinkedHashMap<String, Integer>();

		for (Entry<String, Integer> entry : list) {

			sortedmap.put(entry.getKey(), entry.getValue());
		}

		// print sorted map
		System.out.println(sortedmap);
	}

}
