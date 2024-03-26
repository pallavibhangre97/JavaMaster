package leetcode.easy;

import java.util.Arrays;

public class AnagramString {
//we can solve this using hashmap also
	public static void main(String[] args) {
		String s1 = "pallavi";
		String s2 = "ivllaap";
		if (checkAnagram(s1, s2)) {
			System.out.println("strings are anagram");
		} else {
			System.out.println("strings are not anagram");
		}

	}

	public static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < s1.length(); i++) {
			if (ch1[i] != ch2[i])
				return false;
		}

		return true;
	}

}
