package practice;

public class Armstrong {

	public static void main(String[] args) {
		int a = 371;

		int digit = 0;
		int sum = 0;
		int temp = a;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;
		}
		if (sum == a) {
			System.out.println("number is armstrong");

		} else {
			System.out.println("number is not armstrong");

		}

	}

}
