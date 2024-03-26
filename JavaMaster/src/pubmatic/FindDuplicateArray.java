package pubmatic;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 6, 7, 7, 78, 7, 7, 2, 2, 2 };

		Set<Integer> uSet = new HashSet<>();
		Set<Integer> dSet = new HashSet<>();

		for (int a : arr) {
			if (!uSet.add(a)) {
				dSet.add(a);
			}
		}

		System.out.println("Duplicate element:");
		System.out.println(dSet);

		System.out.println("array after removing duplicate");
		System.out.println(uSet);
	}
}
