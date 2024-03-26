package datastructure;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 61, 22, 3, 95, 6, 7, 9 };
		int i = search(arr, 0);
		if (i == -1)
			System.out.println("key not found");
		else
			System.out.println("key found at position : " + i);

	}

	public static int search(int arr[], int key) {

		Arrays.sort(arr);
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			else if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}

		return -1;

	}

}
