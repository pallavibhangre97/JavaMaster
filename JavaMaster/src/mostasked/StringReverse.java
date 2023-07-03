package mostasked;

public class StringReverse {

	public static void main(String[] args) {
		String string = "s dsdsssss";
		String reverseString = "";
		int i = string.length() - 1;
		while (i >= 0) {
			reverseString = reverseString + string.charAt(i);
			i--;

		}
		System.out.println("reverse String -- " + reverseString);
	}

}
