package leetcode.easy;

public class ShiftArrayLeft {

	public static void main(String[] args) {
		int arr[] = { -1, -100, 3, 99 };
		int k = 2;
		int n = arr.length;
//		for (int j = 0; j < k; j++) {
//			int s = arr[0];
//			for (int i = 0; i < n - 1; i++) {
//				arr[i] = arr[i + 1];
//			}
//			arr[n - 1] = s;
//		}

		for (int j = 0; j <= k; j++) {
			int s = arr[0];
			for (int i = 1; i < n; i++) {
				arr[i - 1] = arr[i];
			}
			arr[n - 1] = s;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
