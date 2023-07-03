package leetcode.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = { 2, 5, 9, 11, 15, 17, 20, 42 };
		int target = 16;
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
			if (nums[i] > target)
				return i;
		}
		return nums.length;

	}
}
