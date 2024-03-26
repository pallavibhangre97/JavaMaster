package leetcode.easy;
//https://www.youtube.com/watch?v=mF3ofENSeg8

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 2, 3, 4 };

		int n = arr1.length;

		int i = 0, j = 0;
		while (i < n) {
			if (arr2[j] < arr1[i]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				fixArr2(arr2);
			}
			i++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	private static void fixArr2(int[] arr2) {

		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < arr2[i - 1]) {
				int temp = arr2[i];
				arr2[i] = arr2[i - 1];
				arr2[i - 1] = temp;
			}
		}

	}

}
