package leetcode.easy;

//https://www.youtube.com/watch?v=FEXJGn19u7Y
//https://www.youtube.com/watch?v=CAVnGkDzqAs
public class MaximumNumberofVowelsinSubstringGivenLength {

	public static void main(String[] args) {
		String str = "abcooodef";
		int k = 3;
		System.out.println(maxNoOfVowel(str, k));
	}

	public static int maxNoOfVowel(String str, int k) {
		int i = 0, j = k;
		int ans = 0;
		int max = 0;
		while (j < str.length()) {
			int x = i;
			ans = 0;
			while (x < j) {

				if (isVowel(str.charAt(x++))) {
					ans++;
				}

			}
			if (ans > max)
				max = ans;
			j++;
			i++;
		}
		return max;
	}

	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else
			return false;
	}
}
