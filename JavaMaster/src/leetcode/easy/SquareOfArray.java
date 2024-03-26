package leetcode.easy;

//https://www.youtube.com/watch?v=ih0LW0cuEAk  --easy 
import java.util.Arrays;

public class SquareOfArray {

	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
//second method (https://www.youtube.com/watch?v=fikdT0AI5z4
		int result[] = new int[arr.length];
		int head = 0, tail = arr.length - 1;
		for (int pos = arr.length - 1; pos >= 0; pos--) {

			if (arr[head] > arr[tail]) {
				result[pos] = arr[head];
				head++;
			} else {
				result[pos] = arr[tail];
				tail--;
			}

		}
		System.out.println(Arrays.toString(result));

	}

}
