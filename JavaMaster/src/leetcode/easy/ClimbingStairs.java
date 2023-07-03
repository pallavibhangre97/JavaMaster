package leetcode.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(9));

	}

	public static int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int c = 0;
		int a = 1, b = 2;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;

	}
}
