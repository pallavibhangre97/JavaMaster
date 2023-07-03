package leetcode.easy;

public class RemoveElement {
	public static void main(String argsp[]) {
		int nums[] = { 2, 2, 2, 2, 2, 4, 4, 4, 4, 4 };
		int val = 2;
		System.out.println("in main" + removeElement(nums, val));

	}

	public static int removeElement(int[] nums, int val) {
		/*
		 * int j = nums.length - 1; int i = 0, count = 0; while (i < j) {
		 * System.out.println("i= " + i + " " + "j= " + j); if (nums[j] == val) {
		 * System.out.println("in first if"); j--; System.out.println("j= " + j); } if
		 * (nums[i] == val && nums[j] != val) { count++; nums[i] = nums[j];
		 * 
		 * j--; } else { i++; } } System.out.println("printing array"); for (int a :
		 * nums) { System.out.print(a + " "); } return nums.length - count - 1;
		 */
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		System.out.println("printing array");
		for (int a : nums) {
			System.out.print(a + " ");
		}
		return count;

	}
}
