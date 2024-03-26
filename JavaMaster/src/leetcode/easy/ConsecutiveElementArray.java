package leetcode.easy;

/*If the array is {5, 2, 3, 1, 4}, then the function should return true because the array has consecutive numbers from 1 to 5.
b) If the array is {83, 78, 80, 81, 79, 82}, then the function should return true because the array has consecutive numbers from 78 to 83.*/
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
