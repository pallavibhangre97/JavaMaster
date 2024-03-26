package leetcode.easy;

public class MergeStringsAlternately {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "pqrs";
		mergeAlternativly(s1, s2);
	}

	private static void mergeAlternativly(String s1, String s2) {
		boolean flag = true;
		StringBuffer sb = new StringBuffer();
		int i = 0, j = 0;

		while (i < s1.length() && j < s2.length()) {

			if (flag) {
				sb.append(s1.charAt(i++));
				flag = false;
			} else {
				sb.append(s2.charAt(j++));
				flag = true;
			}
		}
		while (i < s1.length()) {
			sb.append(s1.charAt(i++));
		}
		while (j < s2.length()) {
			sb.append(s2.charAt(j++));
		}
		System.out.println(sb);

	}
}
