/*Given an unsorted array of numbers,write a function that returns true if the array consists of consecutive numbers.Examples:If the array is{5,2,3,1,4},then the function should return true because the array has consecutive numbers from 1 to 5.*/

package eiqlevel2;

import java.util.Arrays;

public class ConsecutiveElementArray {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2 };

		System.out.println(isconsecutive(arr));
	}

	private static boolean isconsecutive(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + 1)
				return false;
		}

		return true;

	}

}
