package leetcode.easy;

///The sequence follows the rule that each number is equal to the sum of the preceding two numbers. The Fibonacci sequence begins with the following 14 integers: 
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
public class FibonaciSeries {

	public static void main(String args[]) {

		int c = 0;
		int a = 0, b = 1;
		for (int i = 2; i <= 9; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c + " ");
		}

	}

}
