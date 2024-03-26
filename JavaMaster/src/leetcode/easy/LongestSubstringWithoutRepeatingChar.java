package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingChar {
	/*
	 * Given a string s, find the length of the longest substring without repeating
	 * characters. Example 1: Input: s = "abcabcbb" Output: 3
	 */
	public static void main(String[] args) {

		/*
		 * String string = "dvdf"; // my approach HashMap<Character, Integer> map = new
		 * HashMap<>(); int max = 0; int ans = 0;
		 * 
		 * for (int i = 0; i < string.length(); i++) {
		 * 
		 * if (map.containsKey(string.charAt(i))) { map.clear(); max = 0; }
		 * map.put(string.charAt(i), 1); max++;
		 * 
		 * if (ans < max) { ans = max; } } System.out.println(ans);
		 */

		/*
		 * String string = "abcabcbb"; HashMap<Character, Integer> map = new
		 * HashMap<>(); int max = 0; int start = 0; int end = 0;
		 * 
		 * while (end < string.length()) { char c = string.charAt(end);
		 * 
		 * if (map.containsKey(c)) { map.remove(string.charAt(start)); start++; max = 0;
		 * } map.put(c, 1); max++; end++; max = Math.max(max, map.size()); }
		 * 
		 * System.out.println(max);
		 */

		// third approach best
		String string = "pwwkew";

//		Set<Character> set = new HashSet<>();
//		int max = 0;
//
//		int left = 0, right = 0;
//		while (right < string.length()) {
//			char c = string.charAt(right);
//			if (set.add(c)) {
//				max = Math.max(max, right - left + 1);
//				right++;
//			} else {
//				while (string.charAt(left) != c) {
//					set.remove(string.charAt(left));
//					left++;
//				}
//				set.remove(c);
//				left++;
//			}
//		}
//		System.out.println(max);

		// 4th approach (https://www.youtube.com/watch?v=VvS_CtSIeiQ&t=628s)

		int max = 0;
		List<Character> list = new ArrayList<>();
		int start = 0, end = 0;

		while (end < string.length()) {
			char c = string.charAt(end);
			if (!list.contains(c)) {
				list.add(c);
				end++;
				max = Math.max(max, list.size());

			} else {
				list.remove(Character.valueOf(string.charAt(start))); // if i dont use valueof() then it will take ascii
																		// value and we will get
																		// indexOutOfBoundsException
				start++;
			}
		}
		System.out.println(max);
	}

}
