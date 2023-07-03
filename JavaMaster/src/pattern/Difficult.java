package pattern;

public class Difficult {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<< 1st pattern >>>>>>>>>>>>>>>>>>>>");
		// https://www.youtube.com/watch?v=lsOOs5J8ycw 30th pattern
		for (int i = 1; i <= 4; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int h = 2; h <= i; h++) {
				System.out.print(h);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<< 2nd pattern >>>>>>>>>>>>>>>>>>>>");

		for (int i = 1; i <= 4; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int h = i - 1; h >= 1; h--) {
				System.out.print(h);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<< 3rd pattern >>>>>>>>>>>>>>>>>>>>");
		for (int i = 1; i <= 5; i++) {// https://www.youtube.com/watch?v=lsOOs5J8ycw
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print(3 + " ");
				} else if (i == 2 || j == 2 || i == 4 || j == 4) {
					System.out.print(2 + " ");
				} else if (i == 3 && j == 3) {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<< 4th pattern >>>>>>>>>>>>>>>>>>>>");

		for (int i = 1; i <= 4; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<< 5th pattern >>>>>>>>>>>>>>>>>>>>");

		for (int i = 1; i <= 4; i++) {
			// https://www.youtube.com/watch?v=2I8bMrLxMeg time7.onwards
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<< 6th pattern >>>>>>>>>>>>>>>>>>>>");
	}

}
