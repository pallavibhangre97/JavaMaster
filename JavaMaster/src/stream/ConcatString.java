package stream;

import java.util.stream.Stream;

class ConcatString {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";

		// Stream<String>.concat(s1,s2);// we cannot concat string becoz stream api is
		// used to do operation on set ob objcet like array and collection

		Stream<String> s4 = Stream.of("hello", "ii");
		Stream<String> s3 = Stream.of(s2);
		Stream.concat(s4, s3).forEach(System.out::print);

	}
}