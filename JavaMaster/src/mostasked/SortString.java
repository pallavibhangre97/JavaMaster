package mostasked;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {
	public static void main(String[] args) {
		// first method
		String string = "pallavi";
		// char ch[] = string.toCharArray();
// Arrays.sort(ch);
		// String s = new String(ch);
		// System.out.println(s);

		// second method using comparator
		Character ch[] = new Character[string.length()];
		for (int i = 0; i < string.length(); i++) {
			ch[i] = string.charAt(i);
		}

		Arrays.sort(ch, new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
			}
		});

		System.out.println(Arrays.toString(ch));

	}

}
