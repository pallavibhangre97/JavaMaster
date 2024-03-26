package eiqlevel2;

public class Palindrom {

	public static void main(String[] args) {
		String str = "madam";
		int n = str.length();
		System.out.println(isPalindrom(str, n));

	}

	private static Boolean isPalindrom(String str, int n) {

		int i = 0, j = n - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;

	}

}
