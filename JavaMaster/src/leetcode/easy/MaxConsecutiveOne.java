package leetcode.easy;

///Given an array  of 0s and 1s, we are to find the maximum number of consecutive 1s in the array
public class MaxConsecutiveOne {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 0, 1 };
		System.out.println(maxOne(arr));

	}

	private static int maxOne(int[] arr) {
		int count = 0, maxcount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			maxcount = Math.max(maxcount, count);
		}
		return maxcount;
	}
}
