package eiqlevel2;

public class ShiftArrayLeft {

	public static void main(String[] args) {
		int arr[] = { 11, 34, 56, 3, 9, 0, 4, 5, 99 };
		int k = 5;
		int n = arr.length;
		for (int j = 0; j < k; j++) {
			int s = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = s;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
