package practice;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String string = " pallavi is good programmer";
		string = string.trim();
		String arr[] = string.split(" ");

		String str = "";
		String rev = "";
		int j;

		for (int k = 0; k < arr.length; k++) {
			str = arr[k];

			j = str.length() - 1;
			while (j >= 0) {
				rev = rev + str.charAt(j);
				j--;
			}
			rev = rev + " ";

		}
		System.out.println("reverse string " + rev);

	}

}
