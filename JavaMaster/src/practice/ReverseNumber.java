package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 100;
		String temp = "" + n; // conversion of int to string
		StringBuilder sb = new StringBuilder(temp); // creating stringbuilder obj
		StringBuilder str = sb.reverse(); // using reverse method to reverse the obj
		System.out.println(str.toString());

	}

}
