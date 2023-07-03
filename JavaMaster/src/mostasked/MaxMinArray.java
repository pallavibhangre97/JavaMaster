package mostasked;

public class MaxMinArray {

	public static void main(String[] args) {
		int array[] = { 0, 1, 23, 45, 67, 85, 90, 4, 35, 45, 35 };
		int min = array[0];
		int max = array[0];
		for (int i : array) {
			if (i < min)
				min = i;
			else if (i > max) {
				max = i;

			}
		}
		System.out.println("min =" + min);
		System.out.println("max =" + max);
	}

}
