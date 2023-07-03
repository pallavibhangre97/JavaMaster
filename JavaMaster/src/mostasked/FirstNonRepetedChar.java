package mostasked;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonRepetedChar {

	public static void main(String[] args) {
		String string = "pallavviipqqc";
		HashMap<Character, Integer> map = new LinkedHashMap();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else {
				map.put(string.charAt(i), 1);
			}
		}
		System.out.println(map);

		Set<Character> val = map.keySet();
		for (Character r : val) {
			if (map.get(r) == 1) {
				System.out.println("first non repeated character from " + string + " is " + r);
				return;
			}
		}
		System.out.println("all char are repeated");

	}
}
