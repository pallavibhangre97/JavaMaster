package stream;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(11);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(3);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

	}

}
