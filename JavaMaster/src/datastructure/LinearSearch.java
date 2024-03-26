package datastructure;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 9, 34, 1, 3, 7, 8, 89, 0 };
		int i = search(arr, 9);
		if (i == -1)
			System.out.println("key not found");
		else
			System.out.println("key found at position : " + i);

	}

	public static int search(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1; // here dont add 0 becoz if key found at position 0 then in if condition it will
					// print wrong ans

	}

}
