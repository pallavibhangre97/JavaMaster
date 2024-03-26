package leetcode.easy;

public class MaximumAverageSubarray {
	public static void main(String[] args) {
		int arr[] = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(maxAvg(arr, k));
		System.out.println(maxAvg1(arr, k));

	}

	//// https://www.youtube.com/watch?v=56TxHMG0qhQ
	private static double maxAvg1(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		int maxSum = sum;
		int i = 0;
		int j = k;
		while (j < arr.length) {
			sum = sum - arr[i++];
			sum = sum + arr[j++];
			maxSum = Math.max(maxSum, sum);
		}
		return (double) maxSum / k;
	}

//my logic
	private static double maxAvg(int[] arr, int k) {
		if (k > arr.length) {
			return -1;
		}
		double maxavg = 0;
		int i = 0;
		int j = k - 1;
		while (j < arr.length) {
			int s = i;
			double avg = 0;
			int sum = 0;
			while (s <= j) {
				sum = sum + arr[s++];
			}

			maxavg = Math.max(maxavg, (sum / k));// instead of finding max avg find maxsum
			j++;
			i++;
		}
		return maxavg;
	}
}
