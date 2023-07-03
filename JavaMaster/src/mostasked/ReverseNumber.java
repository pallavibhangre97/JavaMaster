package mostasked;

public class ReverseNumber {

	public static void main(String[] args) {
		reverse(100);
	}

	public static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;

		}
		System.out.println(reverse);
	}

	/*
	 * this is correct for 100
	 * 
	 * int n = 100; String temp = "" + n; // conversion of int to string
	 * StringBuilder sb = new StringBuilder(temp); // creating stringbuilder obj
	 * StringBuilder str = sb.reverse(); // using reverse method to reverse the obj
	 * System.out.println(str.toString());
	 */

}
