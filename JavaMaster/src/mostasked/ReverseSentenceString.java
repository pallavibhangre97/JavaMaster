package mostasked;

public class ReverseSentenceString {

	public static void main(String[] args) {
		String string = " TODO Auto-generated method stub";
		String strings[] = string.split(" ");

		String reverseString = "";
		int i = strings.length - 1;
		while (i >= 0) {
			reverseString = reverseString + strings[i--];
			reverseString = reverseString + " ";
			// reverseString =strings[i--]+" "+reverseString;
		}
		System.out.println("output== " + reverseString);
	}

}
