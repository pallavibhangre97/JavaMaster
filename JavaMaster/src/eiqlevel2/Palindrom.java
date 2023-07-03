package eiqlevel2;

public class Palindrom {

	public static void main(String[] args) {
		String str = "pa ";
		int n = str.length();
		int i = 0, j = n - 1;
		boolean flag = true;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;

		}
		if (flag) {
			System.out.println("string is palindrom");

		} else {
			System.out.println("string is not palinrom");
		}
	}

}
