package eiqlevel2;

import java.util.Arrays;

public class RemoveDupSortedArray {

	public static void main(String[] args) {
		/*
		 * System.out.println("Enter size of array :"); Scanner scanner = new
		 * Scanner(System.in); int n = scanner.nextInt(); int arr[] = new int[n];
		 * System.out.println("enter array elements:"); for (int i = 0; i < n; i++) {
		 * arr[i] = scanner.nextInt(); }
		 * 
		 * System.out.println("array is :");
		 * 
		 * for (int i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
		 */

		int arr[] = { 2, 35, 6, 6, 5, 3, 22, 2, 2, 4 };
		int n = arr.length;
		Arrays.sort(arr);
		int j = 0;
		System.out.println("Array after sorting  :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		System.out.println("Array after removing dup :");
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
