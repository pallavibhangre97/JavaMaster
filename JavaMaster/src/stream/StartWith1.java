package stream;

import java.util.ArrayList;
import java.util.List;

public class StartWith1 {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(15);
		myList.add(20);
		myList.add(11);
		myList.add(40);
		myList.add(10);
		myList.add(17);
		myList.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("1")).forEach(System.out::println);

		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}