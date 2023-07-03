package pattern;

public class Number_Pattern_Program {

	public static void main(String[] args) {

		////// number pattern

		/*
		 * please read must https://www.youtube.com/watch?v=lsOOs5J8ycw (pattern 30 )
		 */
		System.out.println("////////////first pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("////////////2nd pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);// we can also print pyramid only add space after j
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////3rd pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////4th pattern///////////// ");
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("////////////5th pattern///////////// ");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////6th pattern///////////// ");

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////7th pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////8th pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////9th pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////10th pattern///////////// ");

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////11 pattern///////////// ");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////12 pattern///////////// ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();

		}
		System.out.println("////////////13 pattern///////////// ");
		System.out.println();

		System.out.println();
		int h = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(h++);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("////////////14 pattern///////////// ");

		h = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((h++) % 2);// similar to 1 to 15 but we have to print 0 and 1 so divide 1 to 15 by 2

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("////////////15 pattern///////////// ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("////////////16 pattern///////////// ");

	}
}
