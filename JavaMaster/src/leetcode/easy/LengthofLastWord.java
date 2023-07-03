package leetcode.easy;

//https://www.youtube.com/watch?v=KT9rltZTybQ
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("length=" + lengthOfLastWord("lu"));
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
