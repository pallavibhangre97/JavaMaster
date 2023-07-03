package practice;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 3, 4, 454, 65, 7 };
		int temp = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		System.out.println("reverse array");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
