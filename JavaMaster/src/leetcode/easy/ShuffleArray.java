package leetcode.easy;

//arr=[1,2,3,4,5,6] = [1,4,2,5,3,6][x1,y1,x2,y2,x3,y3...]
public class ShuffleArray {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 1, 3, 4, 7 };
		int n = arr.length;

		int ans[] = new int[n];
		int x = 0;
		int y = n / 2;

		int a = 0;

		while (a < n) {
			ans[a++] = arr[x++];
			ans[a++] = arr[y++];

		}
		for (int c : ans)
			System.out.print(c + " ");
	}
}
