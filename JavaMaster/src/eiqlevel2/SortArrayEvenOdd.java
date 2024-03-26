package eiqlevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayEvenOdd {

	public static void main(String[] args) {
		int arr[] = { 98, 49, 47, 90, 36 };
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		boolean flag = false;
		int index = 0, k = 0, j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				evenList.add(arr[i]);
			else {
				oddList.add(arr[i]);
			}
		}

		if (arr[0] % 2 == 0) {
			flag = true;
		}
		while (index < n) {
			if (flag && k < evenList.size()) {
				arr[index++] = evenList.get(k++);
				flag = !flag;
			} else {
				arr[index++] = oddList.get(j++);
				flag = !flag;
			}
		}

		for (int i = 0; i < arr.length; i++)

		{

			System.out.print(arr[i] + " ");

		}
	}

}
