package mostasked;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = {};
		int nums2[] = { 1 };
		// System.out.println(nums1.length);
		mergeSortedArray(nums1, nums2);

	}

	private static void mergeSortedArray(int[] nums1, int[] nums2) {
		int m = nums1.length;

		if (nums2.length == 0) {
			System.out.println(Arrays.toString(nums1));
		} else if (nums1.length == 0) {
			System.out.println(Arrays.toString(nums2));
		} else {
			int i = 0, j = 0;
			for (i = 0; i < m; i++) {
				if (nums1[i] > nums2[0]) {
					int temp = nums1[i];
					nums1[i] = nums2[0];
					nums2[0] = temp;
					fixArray(nums2);
				}
			}
			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));
		}

	}

	private static void fixArray(int[] nums2) {
		for (int i = 1; i < nums2.length; i++) {
			if (nums2[i - 1] > nums2[i]) {
				int temp = nums2[i];
				nums2[i] = nums2[i - 1];
				nums2[i - 1] = temp;
			}
		}
	}

}
