package mostasked;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		String string = "foo";
		String tString = "baa";
		System.out.println(isIsomorphic(string, tString));

	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				if (map.get(ch) != t.charAt(i)) {
					return false;
				}

			} else if (map.containsValue(t.charAt(i))) {
				return false;
			} else {
				map.put(ch, t.charAt(i));
			}
		}

		return true;
	}
}
