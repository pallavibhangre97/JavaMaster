package mostasked;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String string = "TODO Auto-generated method stub";
		String[] strings = string.split(" ");
		String reverseString = "";

		for (String s : strings) {
			int k = s.length() - 1;
			while (k >= 0)
				reverseString = reverseString + s.charAt(k--);
			reverseString = reverseString + " ";
		}
		System.out.println("reverse string= " + reverseString);
	}

}
