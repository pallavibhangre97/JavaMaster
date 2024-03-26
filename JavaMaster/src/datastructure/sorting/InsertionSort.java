package datastructure.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 6, 0, 3, 5, 7, 8 };
		bubbleSort(arr);
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length, pass = 0;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
			pass++;
		}
		System.out.println(pass);
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
