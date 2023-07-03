/*How can a hashmap be used to check whether two given arrays are equal or not i.e they contain the same elements or not? Given the arrays can be unsorted.*/

package hashmapimpl;

import java.util.Collection;
import java.util.HashMap;

public class HashMapArrayCheck {
	public static void main(String args[]) {
		boolean b = check();
		System.out.println(b);
	}

	static public boolean check() {
		int arr1[] = { 1, 3, 4, 2, 8, 5, 5 };
		int arr2[] = { 1, 3, 6, 2, 8, 5, 5 };
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map1.containsKey(arr1[i])) {
				map1.put(arr1[i], map1.get(arr1[i]) + 1);
			} else {
				map1.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map1.containsKey(arr2[i])) {
				map1.put(arr2[i], map1.get(arr2[i]) - 1);
			} else {
				return false;
			}
		}
		Collection<Integer> valuIntegers = map1.values();
		for (Integer r : valuIntegers) {
			if (r != 0)
				return false;
		}

		System.out.println(map1);
		return true;
	}

}
