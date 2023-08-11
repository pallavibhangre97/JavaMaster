package stream;

import java.util.Arrays;

public class StringUppercase {

	public static void main(String[] args) {
		String arr[] = { "geeks", "for", "geeks" };
		Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);
	}

}
