package hashmapimpl;

import java.util.HashMap;

public class StringbuilderKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<StringBuilder, Integer> s = new HashMap<>();
		StringBuilder sb = new StringBuilder("pallavi");
		s.put(sb, 1);
		sb.append("sachin");
		s.put(sb, 2);
		sb.append("chinchwade");
		s.put(sb, 4);

		System.out.println(s.size());
		System.out.println(s);
	}

}
