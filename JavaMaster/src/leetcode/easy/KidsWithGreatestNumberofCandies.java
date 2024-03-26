package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=aDTWuV7V4yQ
public class KidsWithGreatestNumberofCandies {
	public static void main(String[] args) {
		int candies[] = { 2, 3, 5, 1, 1 };
		int extraCandy = 3;
		extraCandy(candies, extraCandy);
	}

	private static void extraCandy(int[] candies, int extraCandy) {
		List<Boolean> list = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max)
				max = candies[i];
		}

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandy >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		System.out.println(list);
	}
}
