package eiqlevel2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupString {

	public static void main(String[] args) {
		String string = "pallavi";
		int n = string.length();
		HashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(string.charAt(i));
		}

		for (Character ch : set)
			System.out.print(ch);

		System.out.println();
		// using indexof method
		String anString = "";
		for (int i = 0; i < n; i++) {
			char ch = string.charAt(i);
			if (anString.indexOf(ch) == -1) {
				anString = anString + ch;
			}
		}
		System.out.println("string :" + anString);
	}

}
