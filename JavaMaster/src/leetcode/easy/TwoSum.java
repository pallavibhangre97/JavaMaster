package leetcode.easy;

import java.util.Arrays;

//https://www.youtube.com/watch?v=UXDSeD9mN-k
//two approach - using hashmap  2)using two pointer and basic maths
//two pointer approach is best it will cover duplicate element problem 
public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4 };
		int res[] = twoaSum(arr);
		System.out.println(Arrays.toString(res));
	}

	public static int[] twoaSum(int arr[]) {

		int target = 6;

		// first appeoach using hashing
		/*
		 * HashMap<Integer, Integer> map = new HashMap<>(); for (int i = 0; i <
		 * arr.length; i++) { map.put(arr[i], i);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < arr.length; i++) { int num = arr[i]; int rem = target -
		 * num; if (map.containsKey(rem)) {
		 * 
		 * return new int[] { i, map.get(rem) }; } } return new int[] {};
		 */

		// second approach using two pointer .this will work only if array is sorted

//		int i = 0, j = arr.length - 1;
//		while (i < j) {
//			int sum = arr[i] + arr[j];
//			if (sum == target) {
//				return new int[] { i, j };
//			} else if (sum < target) {
//				i++;
//
//			} else {
//				j--;
//			}
//		}
//		return new int[] {};
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int ans = target - arr[i];
			int j = i + 1;
			while (j < n) {
				if (arr[j] == ans) {
					return new int[] { i, j };
				}
				j++;
			}
		}
		return new int[] {};
	}
}
