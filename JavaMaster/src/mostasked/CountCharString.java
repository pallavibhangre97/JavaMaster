package mostasked;

public class CountCharString {

	public static void main(String[] args) {
		// count occurence of char from string
		String str = "pll vi";
		int count = 0;
		char ch = 'a';
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("occurence of a =" + count);

		// second sol
		// first replace all a with "" then count length of str after replacing then
		// substract from previous str (without replac)
		count = 0;
		count = str.length() - str.replaceAll("a", "").length();
		System.out.println("occurence of a =" + count);

	}

}
