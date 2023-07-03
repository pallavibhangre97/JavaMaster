package leetcode.easy;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 1 };
		System.out.println("in main" + removeDuplicates(arr));
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0, j = 0;
		while (i != nums.length) {
			if (nums[i] == nums[j]) {
				i++;
			} else {
				j++;
				nums[j] = nums[i++];
			}
		}

		return j + 1;
	}
}
