package mostasked;

public class CountWordsString {

	public static void main(String[] args) {
		int count = 0;
		String string = "  pallavi is  good p rogrammer ";
		string = string.trim();

		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
				count++;
		}
		System.out.println("count = " + (count + 1));
	}

}
