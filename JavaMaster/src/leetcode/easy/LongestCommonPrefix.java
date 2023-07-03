/*
 * Longest Common Prefix
 * First we will find the shortest string and its length.
Secondly, we will take the first string and match its each character one by one with all the other strings.
As soon as we encounter a character which does not match, we will break out of loop.
 * 
 * 
 * 
 * 
 * */

package leetcode.easy;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		int minilength = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minilength)
				minilength = strs[i].length();
		}
		System.out.println("minilength " + minilength);
		String resultString = "";

		for (int i = 0; i < minilength; i++) {
			char current = strs[0].charAt(i);
			for (String s : strs) {
				if (current != s.charAt(i))
					return resultString;
			}
			resultString = resultString + current;
		}

		return resultString;
	}

	public static void main(String argsp[]) {

		String[] strs = { "ab", "a" };

		System.out.println(longestCommonPrefix(strs));

	}

}
