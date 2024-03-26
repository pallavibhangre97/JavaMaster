package pubmatic;

public class SegregateOddEvenArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 2, 4, 6, 8 };
		segragateOddEven(arr);
		print(arr);

	}

	private static void print(int[] arr) {

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	private static void segragateOddEven(int[] arr) {

		if (arr.length <= 1) {
			return;
		}

		int left = 0, right = arr.length - 1;

		while (left < right) {

			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			while (arr[right] % 2 != 0 && left < right) {
				right--;
			}

			int a = arr[left];
			arr[left] = arr[right];
			arr[right] = a;
			left++;
			right--;

		}
	}

}
