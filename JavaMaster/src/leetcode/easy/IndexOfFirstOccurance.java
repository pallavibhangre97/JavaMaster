package leetcode.easy;

//https://www.youtube.com/watch?v=S797iEgjluQ&t=423
public class IndexOfFirstOccurance {
	public static void main(String args[]) {
		System.out.println(strStr("sradbutsa", "sad"));
	}

	// public static int strStr(String haystack, String needle) {

	// return haystack.indexOf(needle);
	// }
	public static int strStr(String haystack, String needle) {
		int n1 = haystack.length();

		for (int i = 0; i < n1; i++) {

			if (haystack.charAt(i) == needle.charAt(0)) {

				if (compare(haystack, needle, i) == true)

					return i;
			}
		}

		return -1;

	}

	private static boolean compare(String haystack, String needle, int index) {

		int n2 = needle.length();

		int n1 = haystack.length();
		for (int i = 0; i < n2; i++) {
			if (index >= n1)
				return false;
			if (haystack.charAt(index++) != needle.charAt(i))
				return false;
		}
		return true;
	}
}
