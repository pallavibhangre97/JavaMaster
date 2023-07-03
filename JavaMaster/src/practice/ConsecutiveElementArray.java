package practice;

import java.util.Arrays;

public class ConsecutiveElementArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 1, 9 };
		System.out.println(isconsecutive(arr));
	}

	public static boolean isconsecutive(int arr[]) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + 1)
				return false;

		}
		return true;
	}

}
