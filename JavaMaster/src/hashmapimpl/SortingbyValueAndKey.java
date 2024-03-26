package hashmapimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortingbyValueAndKey {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Pallavi");
		map.put(2, "Sachin");
		map.put(3, "Abha");
		map.put(9, "Abha");
		map.put(4, "Sanvi");
		map.put(5, "Sayali");
		map.put(16, "Aishu");
		sortbyValue(map);
		sortByKey(map);

	}

	static void sortbyValue(Map<Integer, String> map) {
		System.out.println("sorting hashmap by values....");
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> listEntry : list) {
			sortedMap.put(listEntry.getKey(), listEntry.getValue());
		}
		System.out.println(sortedMap);

	}

	static void sortByKey(Map<Integer, String> map) {
		System.out.println("sorting hashmap by keys....");

		List<Integer> keyList = new ArrayList<>(map.keySet());
		Collections.sort(keyList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 == o2)
					return 0;
				else if (o1 > o2)
					return 1;
				else
					return -1;
			}
		});
		for (Integer i : keyList) {

			System.out.println(i + " " + map.get(i));
		}

	}
}
