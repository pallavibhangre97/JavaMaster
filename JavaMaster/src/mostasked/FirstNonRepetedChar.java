package mostasked;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepetedChar {

	public static void main(String[] args) {
		String string = "palpavviipqqcc";
		HashMap<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else {
				map.put(string.charAt(i), 1);
			}
		}
		// System.out.println(map);

//		Set<Character> val = map.keySet();
//		for (Character r : val) {
//			if (map.get(r) == 1) {
//				System.out.println("first non repeated character from " + string + " is " + r);
//				return;
//			}
//		}
		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) == 1) {
				System.out.println("first non repeated character from " + string + " is " + string.charAt(i));
				return;
			}
		}

		System.out.println("all char are repeated");

	}
}
