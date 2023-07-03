package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(11));

	}

	private static boolean isPrime(int n) {

		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;

	}

}
