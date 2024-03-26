package leetcode.easy;

public class ShiftArrayRight {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n = arr.length - 1;
		int temp = 0, j = 0;

		for (int i = 0; i < k; i++) {
			temp = arr[n];
			for (j = n; j > 0; j--) {

				arr[j] = arr[j - 1];

			}

			arr[j] = temp;
		}

		for (int c : arr) {
			System.out.print(c + " ");
		}

	}

}
