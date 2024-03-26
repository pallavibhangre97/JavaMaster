package mostasked;

public class Factorial {

	public static void main(String[] args) {
		long sum = 1;
		int i = 2;
		int n = 10;

		while (i <= n) {
			sum = sum * i;
			i++;

		}
		System.out.println("Factorial - " + sum);
		System.out.println(fact(n));
	}

	private static int fact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return num * fact(num - 1);
	}

}
