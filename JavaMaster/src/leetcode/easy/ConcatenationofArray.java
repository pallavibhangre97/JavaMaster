package leetcode.easy;

public class ConcatenationofArray {

	public static void main(String[] args) {

		int num[] = { 1, 3, 2, 1 };
		int n = num.length;
		int ans[] = new int[n * 2];
		int j = 0;

		for (int i = 0; i < ans.length; i++) {

			if (j < n) {
				ans[i] = num[j++];
				if (j >= n)
					j = 0;
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
