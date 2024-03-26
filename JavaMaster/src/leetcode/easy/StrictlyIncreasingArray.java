package leetcode.easy;

/*
 * 
 * Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return
 
 *https://www.youtube.com/watch?v=6TtdADsT_Us
 */
public class StrictlyIncreasingArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 10, 1, 17 };
		System.out.println(isIncreasing(arr));

	}

	private static boolean isIncreasing(int[] arr) {
		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				count++;
				if (arr[i] <= arr[i - 2])
					arr[i] = arr[i - 1];
			}
		}
		if (count > 1)
			return false;
		else {
			return true;
		}
	}

}
