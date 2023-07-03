package mostasked;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 8, 9, 0, 44, 6 };
		int i = 0;
		int j = arr.length - 1;
		int temp = 0;
		while (i < j) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		System.out.println("array after reverse");
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

}
