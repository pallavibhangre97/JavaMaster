package practice;

public class PalindromStringNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrom(" s       "));
		System.out.println(isPalindromNumber(1));
	}

	private static boolean isPalindromNumber(int n) {
		String string = Integer.toString(n);
		string = string.trim();
		int i = 0;
		int j = string.length() - 1;
		while (i < j) {
			if (string.charAt(i) != string.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

	public static boolean isPalindrom(String str) {
		str = str.trim();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

}
