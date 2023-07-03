package mostasked;

// 0 and 1 is not prime
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(74));

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		int i = 2;
		while (i < n) {
			if (n % i == 0)
				return false;
			i++;
		}

		return true;
	}
}
