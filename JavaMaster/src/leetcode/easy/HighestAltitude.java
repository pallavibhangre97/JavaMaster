package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class HighestAltitude {
	public static void main(String[] args) {
		int arr[] = { -5, 1, 5, 0, -7 };
		List<Integer> list = new ArrayList<>();
		list.add(0);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			list.add(sum);
		}
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);

	}
}
