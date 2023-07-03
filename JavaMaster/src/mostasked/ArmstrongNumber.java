package mostasked;

///Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. 
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(armStrong(134));

	}

	public static boolean armStrong(int num) {
		/*
		 * String string = String.valueOf(num); int sum = 0; for (int i = 0; i <
		 * string.length(); i++) { char ch = string.charAt(i); int k = ch - '0'; sum =
		 * sum + (k * k * k); }
		 * 
		 * if (num == sum)
		 * 
		 * return true; else return false;
		 */

		int temp = num;
		int sum = 0, remainder = 0;
		while (temp != 0) {
			remainder = temp % 10; // this is the way to get single digit from number
			sum = sum + (remainder * remainder * remainder);
			temp = temp / 10;

		}
		if (num == sum)
			return true;
		else
			return false;

	}
}
