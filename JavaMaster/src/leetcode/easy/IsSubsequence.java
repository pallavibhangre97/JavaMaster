package leetcode.easy;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bac", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	private static boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}

		if (i == s.length()) {
			return true;
		}

		return false;

		// my solution
//		int tl = t.length();
//		for (int i = 0; i < tl; i++) {
//			if (s.charAt(0) == t.charAt(i)) {
//				if (compare(s, t, i + 1)) {
//					return true;
//
//				}
//			}
//
//		}
//		return false;

	}

//	private static boolean compare(String s, String t, int i) {
//		int sl = s.length();
//		int tl = t.length();
//		int k = 1;
//		for (int j = 1; j < sl; j++) {
//			if (i > tl) {
//				return false;
//			}
//			while (i < tl) {
//				if (s.charAt(j) != t.charAt(i)) {
//					i++;
//				} else {
//					i++;
//					k++;
//					break;
//				}
//			}
//		}
//		if (k == sl) {
//			return true;
//		} else {
//			return false;
//		}
//
}
