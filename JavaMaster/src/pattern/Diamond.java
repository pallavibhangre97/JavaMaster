package pattern;

//https://www.youtube.com/watch?v=YfY7geSEk8w&list=PLRhowdcybcBwtvahqgd3mZC6Enjm7Z0yi&index=11
public class Diamond {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int k = 3; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
