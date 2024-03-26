package leetcode.easy;

/*\
 * https://www.youtube.com/watch?v=usxn9PV6Fdo&t=322s
 */
public class MaximimSubarray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5 };
		int sum = 0;
		int maxsum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum > maxsum) {
				maxsum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}

		}
		System.out.println(maxsum);

	}

}
