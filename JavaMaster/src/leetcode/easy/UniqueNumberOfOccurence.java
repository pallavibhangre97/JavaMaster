package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

//https://www.youtube.com/watch?v=yF-YpgxaotU
public class UniqueNumberOfOccurence {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 4, 4 };

		System.out.println(isUnique(arr));
	}

	private static boolean isUnique(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (int i : map.values()) {
			if (!set.add(i))
				return false;
		}
		return true;
	}
}
