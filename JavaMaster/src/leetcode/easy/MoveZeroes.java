package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 3, 5, 0 };
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[j] == 0) {
				j--;
			}
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			} else {
				i++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
