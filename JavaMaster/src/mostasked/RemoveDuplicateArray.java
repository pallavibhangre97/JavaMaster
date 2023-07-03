package mostasked;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int array[] = { 1, 23, 45, 67, 85, 4, 35, 45, 35, 1, 1, 1, 4 };
		Arrays.sort(array);

		int i = 0, j = 0;

		while (j != array.length) {
			if (array[i] == array[j]) {
				j++;

			} else {
				i++;
				array[i] = array[j++];
			}
		}
		System.out.println("arry after removing duplicate elements");
		for (int k = 0; k < (i + 1); k++) {
			System.out.print(array[k] + " ");
		}

		// second approch

		HashSet<Integer> set = new HashSet<>();
		for (int r : array) {
			if (set.add(r) == false) {
				System.out.println("found dup :" + r);
			}
		}
	}

}
