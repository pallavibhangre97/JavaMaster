package leetcode.easy;

//https://www.youtube.com/watch?v=ZGxqqjljpUI
public class CanPlaceFlowers {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 0, 0, 1 };
		int n = 2;
		if (arr[0] == 0 && arr[1] == 0) {
			n--;
			arr[0] = 1;
		}
		for (int i = 1; i <= arr.length - 2; i++) {
			if (arr[i] == 0 && arr[i - 1] == 0 && arr[i + 1] == 0) {
				n--;
				arr[i] = 1;
			}
		}
		if (arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
			n--;
			arr[arr.length - 1] = 1;
		}
		if (n == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
