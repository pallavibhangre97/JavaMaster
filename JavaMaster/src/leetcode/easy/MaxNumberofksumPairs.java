package leetcode.easy;

import java.util.Arrays;

//https://www.youtube.com/watch?v=HK73YqrLEn0&t=4s
public class MaxNumberofksumPairs {
	public static void main(String[] args) {
		int arr[] = { 3, 1, 3, 4, 3 };
		int k = 6;
		System.out.println(kSumPair(arr, k));
	}

	private static int kSumPair(int[] arr, int k) {
		Arrays.sort(arr);
		int ans = 0;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < k) {
				i++;
			} else if (arr[i] + arr[j] > k) {
				j--;
			} else {
				i++;
				j--;
				ans++;
			}
		}
		return ans;

	}
}
