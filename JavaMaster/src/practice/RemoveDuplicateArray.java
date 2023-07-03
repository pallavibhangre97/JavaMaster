package practice;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int arr[] = { 2, 35, 6, 6, 5, 3, 22, 2, 2, 4 };

		RemoveDup(arr);
	}

	private static void RemoveDup(int[] arr) {
		Arrays.sort(arr);

		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (arr[i] == arr[j]) {
				j++;
			} else {
				i++;
				arr[i] = arr[j++];
			}
		}
		System.out.println("Array after removing dup");

		for (int k = 0; k < (i + 1); k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
