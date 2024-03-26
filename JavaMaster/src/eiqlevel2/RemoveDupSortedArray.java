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

		System.out.println("Array after sorting  :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		// int j = 0;
//		for (int i = 0; i < n - 1; i++) {
//			if (arr[i] != arr[i + 1]) {
//				arr[j++] = arr[i];
//			}
//		}
//		arr[j++] = arr[n - 1];
//		System.out.println("Array after removing dup :");
//		for (int i = 0; i < j; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// second approch
		System.out.println();
		int j = 1, i = 0;
		while (j < arr.length) {
			if (arr[i] != arr[j]) {
				arr[++i] = arr[j++];
			} else {
				j++;
			}
		}
		System.out.println("Array after removing duplicate ");
		for (int k = 0; k <= i; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
