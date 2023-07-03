package leetcode.easy;

//https://www.youtube.com/watch?v=smWjd5p5oLA
public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(mySqrt(2147395599));
	}

	/*
	 * public static int mySqrt(int x) {//log(n) int i = 1; while (i * i <= x) i++;
	 * 
	 * return i - 1;
	 * 
	 * }
	 */

	public static int mySqrt(int x) {
		int start = 1;
		int end = x;
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid <= x / mid) {

				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	/*
	 * public int mySqrt(int x) { int start = 1; int end = x; int ans=0; while
	 * (start <= end) { int mid = (start + end) / 2; int srt=mid*mid; if (srt == x)
	 * { return mid; } else if (srt < x) { ans =mid; start = mid + 1; } else { end =
	 * mid - 1; } } return ans;
	 * 
	 * }
	 */
}
