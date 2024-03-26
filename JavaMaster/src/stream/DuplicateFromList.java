package stream;

//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFromList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 7, 5, 67);
		Set<Integer> set = new HashSet<>();

		// first element of list
		System.out.println("first element from list is ");
		list.stream().findFirst().ifPresent(System.out::println);

		// count total element
		System.out.println("total count");
		System.out.println(list.stream().count());

		// even number
		System.out.println("even numbers are :");
		list.stream().filter(s -> s % 2 != 0).forEach(System.out::println);

		// max element
		System.out.println("max element:");
		list.stream().max(Integer::compare).ifPresent(System.out::println);

		// min
		System.out.println("min ");
		int min = list.stream().min(Integer::compare).get();
		System.out.println(min);

		// sorting
		System.out.println("sorting:");
		list.stream().sorted().forEach(System.out::println);

		// sorting in reverse

		System.out.println("sorting in reverse :");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		/*
		 * Given an integer array nums, return true if any value appears at least twice
		 * in the array, and return false if every element is distinct.
		 */

		/// duplicate element
		System.out.println("duplicate elements are :");
		list.stream().filter(s -> !set.add(s)).forEach(System.out::println);
		if (list.size() == set.size()) {// initial size of set and list is 16 by default

			System.out.println("Duplicate Not Present");
		} else {
			System.out.println("dupicate present ");
		}
	}

}
