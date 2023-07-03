package leetcode.easy;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reString = addBinary("111", "101");
		System.out.println("res=" + reString);
	}

	public static String addBinary(String a, String b) {

		int alen = a.length();
		int blen = b.length();
		int i = 0;
		int carry = 0;
		String res = "";

		while (i < alen || i < blen || carry != 0) {
			int x = 0;
			if (i < alen && a.charAt(alen - 1 - i) == '1')
				x = 1;
			int y = 0;
			if (i < blen && b.charAt(blen - 1 - i) == '1')
				y = 1;

			res = (x + y + carry) % 2 + res;
			carry = (x + y + carry) / 2;
			i++;

		}

		return res;

	}
}
