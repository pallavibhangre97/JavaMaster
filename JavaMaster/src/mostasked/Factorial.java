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
	}

}
