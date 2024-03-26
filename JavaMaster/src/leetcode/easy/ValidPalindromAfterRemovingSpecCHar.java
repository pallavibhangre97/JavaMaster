package leetcode.easy;

public class ValidPalindromAfterRemovingSpecCHar {

	public static void main(String[] args) {
		String str = "raca a car";

		str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) >= 65 && str.charAt(i) <= 92) {
//				char ch = (char) ((char) str.charAt(i) + 32);
//				str = str.replace(str.charAt(i), ch);
//			}
//		}
//		System.out.println(str);

		int i = 0, j = str.length() - 1;
		boolean flag = true;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
			}
			i++;
			j--;
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
