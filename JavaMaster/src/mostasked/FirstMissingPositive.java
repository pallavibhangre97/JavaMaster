package mostasked;

import java.util.Arrays;

/*Given an unsorted array arr[] with both positive and negative elements, the task is to find the smallest positive number missing from the array.(https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/)
Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1
 for logic (https://www.youtube.com/watch?v=aBhla9jSAeg)
 for code (https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/)


*/

public class FirstMissingPositive {

	public static void main(String[] args) {
		int arr[] = { -6, 2, 3, 4, 5 };
		Arrays.sort(arr);
		int ans = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ans)
				ans++;

		}
		System.out.println("missing :" + ans);
	}

}
