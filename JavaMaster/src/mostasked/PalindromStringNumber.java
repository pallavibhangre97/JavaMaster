package mostasked;

public class PalindromStringNumber {

	public static boolean isPalindrom(String str) {
		str = str.trim();
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrom("@222@"));
		System.out.println(isPalindromNumber(222));
	}

	public static boolean isPalindromNumber(int num) {
		String str = Integer.toString(num);
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}
}
