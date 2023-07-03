package eiqlevel2;
//check each word is palindrome in a sentence

public class PalindromEachWord {

	public static void main(String[] args) {
		String string = "pallavi madam asa";

		String ans = "";
		string = string.trim();
		String[] strings = string.split(" ");

		for (int i = 0; i < strings.length; i++) {
			String str = strings[i];
			boolean flag = true;
			int k = 0;
			int j = str.length() - 1;
			while (k < j) {
				if (str.charAt(k) != str.charAt(j)) {
					flag = false;
					break;
				}
				k++;
				j--;
			}
			if (flag)

				ans = ans + str + " ";
		}
		if (ans == "")
			System.out.println(" no palindrom words  present in string");
		else
			System.out.println("palindrom words  are " + ans);
	}

}
