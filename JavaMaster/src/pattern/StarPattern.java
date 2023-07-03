package pattern;

public class StarPattern {
	public static void main(String args[]) {
		System.out.println("////////////first pattern///////////// ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println();

		System.out.println("////////////second pattern///////////// ");
		/*
		 * please read https://www.youtube.com/watch?v=gnNT71J9rb0
		 * 
		 * 
		 * 
		 */
		int k = 4;
		for (int i = 0; i < 5; i++) {
			for (k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("////////////third pattern///////////// ");
		k = 4;
		for (int i = 0; i < 5; i++) {
			for (k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("////////////forth pattern///////////// ");

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////fifth pattern///////////// ");

		k = 4;
		for (int i = 0; i < 5; i++) {
			for (k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////sixth pattern///////////// ");

		for (int i = 0; i < 5; i++) {
			for (k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}

/////////////////star pattern 
		System.out.println("////////////seventh pattern///////////// ");
		for (int i = 0; i < 5; i++) {
			for (int h = 4; h > i; h--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*"); // we can create pyramid pattern same as this only add space after *

			}
			System.out.println();
		}

		System.out.println("////////////8th pattern///////////// ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 4 || j == 0 || i == j)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////9th pattern///////////// ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4)
					System.out.print("* ");

				else
					System.out.print("  ");

			}
			System.out.println();
		}

		System.out.println("////////////10th pattern///////////// ");
		int b = 0;
		for (int i = 1; i < 5; i++) {
			for (int m = 3; m >= i; m--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + b; j++) {
				System.out.print("*");
			}
			b++;
			System.out.println();
		}

		System.out.println("////////////11th pattern///////////// ");
		b = 0;
		for (int i = 1; i <= 4; i++) {
			for (int m = 3; m >= i; m--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + b; j++) {

				System.out.print("*");

			}
			b++;
			System.out.println(" ");
		}
		b--;
		for (int i = 3; i >= 1; i--) {
			for (int m = 3; m >= i; m--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i + b; j++) {

				System.out.print("*");

			}
			b--;
			System.out.println(" ");
		}

		System.out.println();

		System.out.println("////////////12th pattern///////////// ");

		for (int i = 4; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		System.out.println("////////////13th pattern///////////// ");
		int k1 = 4;
		for (int i = 0; i < 4; i++) {
			for (int k2 = 0; k2 < i; k2++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k1; j++) {
				System.out.print("*");
			}
			k1--;
			System.out.println();
		}

		k1 = k1 + 2;
		for (int i = 2; i <= 4; i++) {
			for (int k2 = 0; k2 < k1; k2++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			k1--;
			System.out.println();
		}

		System.out.println("////////////14th pattern///////////// ");

		for (int i = 1; i < 5; i++) {
			for (int k11 = 1; k11 < i; k11++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i >= 0; i--) {
			for (int k11 = 0; k11 < i; k11++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("////////////15th pattern///////////// ");
//https://www.youtube.com/watch?v=FgVs8YJDR_A
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= 7; j++) {
				if (i + j == 5 || (i + 3) == j || i == 4)
					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}

	}
}
