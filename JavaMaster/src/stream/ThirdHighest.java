package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://www.youtube.com/watch?v=GT5aftSKnFE
public class ThirdHighest {

	public static void main(String[] args) {
		Integer arr[] = { 100, 84, 83, 86, 34, 5, 2, 3 };
		List<Integer> list = Arrays.asList(arr);

		// third highest
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);

		// highest
		int val = list.stream().max(Integer::compare).get();
		System.out.println("highest value : " + val);
	}

}
