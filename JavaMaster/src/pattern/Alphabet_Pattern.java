package pattern;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		System.out.println("......................1st pattern ....................");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}

		System.out.println("......................2nd pattern ....................");
		System.out.println();
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64));
			}
			System.out.println();
		}
		System.out.println("......................3rd pattern ....................");
		System.out.println();
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}
		System.out.println("......................4th pattern ....................");
		System.out.println();
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}
		System.out.println("......................5th pattern ....................");
		System.out.println();
		for (int i = 1; i < 5; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}

		System.out.println("......................6th pattern ....................");
		System.out.println();

		for (int i = 1; i < 5; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}

		System.out.println("......................7th pattern ....................");
		System.out.println();

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}

		for (int i = 3; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}

	}

}
