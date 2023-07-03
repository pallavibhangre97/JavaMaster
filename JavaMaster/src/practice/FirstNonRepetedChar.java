package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonRepetedChar {

	public static void main(String[] args) {
		String string = "ppallavvii";
		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Character> keyCharacters = map.keySet();
		for (Character c : keyCharacters) {
			if (map.get(c) == 1) {
				System.out.println("first non repeated character is :" + c);
				return;
			}
		}
		System.out.println("All char are  repeated  in string ");
	}

}
