package mostasked;

public class CountWordsString {

	public static void main(String[] args) {
		int count = 0;
		String string = "  pallavi good p rogrammer ssadccdc";
		string = string.trim();
		if (string.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
//
//		String[] arr = string.split(" ");
//		System.out.println("count=" + arr.length);

		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
				count++;
		}
		System.out.println("count = " + (count + 1));
	}

}
