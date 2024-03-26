package mostasked;

import java.util.HashMap;

public class NoOfOccurence {

	public static void main(String[] args) {
		String string = "Pallavi";
		boolean flag = false;
		HashMap<Character, Integer> map = new HashMap<>();
		int n = string.length();
		char ch;
		for (int i = 0; i < n; i++) {
			ch = string.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		if (map.get('b') == null) {
			System.out.println("character not found in string ");
		} else {
			System.out.println("Number of occurence of p= " + map.get('P'));
		}

//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//
//		for (Entry<Character, Integer> entry : entrySet) {
//			if (entry.getKey() == 'P') {
//				System.out.println("Number of occurence of p= " + entry.getValue());
//				flag = true;
//				break;
//			}
//		}
//		if (flag == false) {
//			System.out.println("character not found in string ");
//		}
//		System.out.println(map.get('r'));

	}

}
