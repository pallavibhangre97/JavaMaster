package leetcode.easy;

//https://www.youtube.com/watch?v=umeCFXJSZY8&t=7s
public class PivotIndex {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(arr));
	}

	private static int pivotIndex(int[] arr) {
		int leftsum = 0;
		int rightSum = 0;
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			rightSum = rightSum + arr[i];
		}

		System.out.println("rightsum=" + rightSum);
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (rightSum == leftsum) {
					return 0;
				}
			} else {
				leftsum = leftsum + arr[i - 1];
				rightSum = rightSum - arr[i];
				System.out.println("rightsum=" + rightSum);
				System.out.println("leftsum=" + leftsum);

				if (leftsum == rightSum) {
					return i;
				}
			}
		}
		return -1;
	}
}
