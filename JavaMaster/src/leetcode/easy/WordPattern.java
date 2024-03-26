package leetcode.easy;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String string = "dog cat cat dog";
		String arr[] = string.split(" ");
		System.out.println(isWordPattern(pattern, arr));

	}

	private static boolean isWordPattern(String pattern, String[] arr) {

		if (pattern.length() != arr.length) {
			return false;
		}

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			String ch = Character.toString(pattern.charAt(i));
			// System.out.println(ch);
			if (map.containsKey(ch)) {
				// System.out.println("yes");
				// System.out.println(map.get(ch));
				// System.out.println(arr[i]);
				// System.out.println(map.get(ch).equals(arr[i]));
				if (!map.get(ch).equals(arr[i])) {
					return false;
				}
			} else if (map.containsValue(arr[i]) && !map.containsKey(ch)) {
				return false;

			} else {
				map.put(String.valueOf(ch), arr[i]);
				// System.out.println("addeed");
			}
		}

		return true;

	}

}
