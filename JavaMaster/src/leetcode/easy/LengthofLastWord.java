package leetcode.easy;

//https://www.youtube.com/watch?v=KT9rltZTybQ
public class LengthofLastWord {

	public static void main(String[] args) {

		String string = "             "; // preffer this approach
		string = string.trim();
		int count = 0;
		if (string.isEmpty()) {
			count = 0;
		} else {
			int i = string.length() - 1;
			while (string.charAt(i) != ' ') {
				count++;
				i--;
			}
		}
		System.out.println(count);
		// System.out.println("length=" + lengthOfLastWord("lu"));
	}

	/*
	 * public static int lengthOfLastWord(String s) {//mine sol if (s == " ") return
	 * 0; String arr[] = s.split(" ");
	 * 
	 * String lastString = arr[arr.length - 1]; return lastString.length(); }
	 */
	public static int lengthOfLastWord(String s) {// from youtube

		int i = s.length() - 1;
		int length = 0;
		if (s == " ")
			return 0;
		while (s.charAt(i) == ' ' && length == 0) {
			i--;

		}
		while (i >= 0 && s.charAt(i) != ' ') {
			length += 1;
			i--;
		}

		return length;

	}
}
