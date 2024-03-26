package leetcode.easy;

//https://www.youtube.com/watch?v=Vc4nQa0e2n4
public class ReverseVowelsOfString {
	public static void main(String[] args) {
		String str = "hello";
		char[] charArray = str.toCharArray();
		reverseVowel(charArray);
	}

	private static void reverseVowel(char[] charArray) {
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			if (!isvovel(charArray[i])) {
				i++;
			}
			if (!isvovel(charArray[j])) {
				j--;

			}
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		System.out.println(String.valueOf(charArray));
	}

	private static boolean isvovel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
}
