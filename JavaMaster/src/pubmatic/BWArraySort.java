package pubmatic;
//Sort a array, [W B W B B W W B ] === [W W W W B B B B ]

public class BWArraySort {

	public static void main(String[] args) {

		char arr[] = new char[] { 'B', 'W', 'W', 'W', 'B', 'W', 'W', 'B' };

		int left = 0, right = arr.length - 1;

		while (left < right) {
			while (arr[left] == 'W' && left < right) {
				left++;
			}

			while (arr[right] == 'B' && left < right) {
				right--;
			}

			char ch = arr[left];
			arr[left] = arr[right];
			arr[right] = ch;
			left++;
			right--;
		}

		for (char ch : arr) {
			System.out.print(ch + " ");
		}

	}

}
