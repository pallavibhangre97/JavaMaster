package main.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*public class BasicRE {
	public static void main(String args[]) {
		int count = 0;
		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("asasasaababas");
		while (matcher.find()) {

			count++;
			System.out.println("start index: " + matcher.start() + ".." + "end index :" + matcher.end() + ".."
					+ "which pattern matched :" + matcher.group());

		}
		System.out.println("//////////////////////");
		System.out.println("count of occurence: " + count);
	}

}


//using character classes
public class BasicRE {
	public static void main(String args[]) {
		int count = 0;
		Pattern pattern = Pattern.compile("[^abcs]");
		Matcher matcher = pattern.matcher("asasasaababas");
		while (matcher.find()) {

			count++;
			System.out.println("start index: " + matcher.start() + ".." + "end index :" + matcher.end() + ".."
					+ "which pattern matched :" + matcher.group());

		}
		System.out.println("//////////////////////");
		System.out.println("count of occurence: " + count);
	}

}
*/

//using predefined character class

public class BasicRE {
	public static void main(String args[]) {
		int count = 0;
		Pattern pattern = Pattern.compile("a?");
		Matcher matcher = pattern.matcher("a sasasaababas@");
		while (matcher.find()) {

			count++;
			System.out.println("start index: " + matcher.start() + ".." + "end index :" + matcher.end() + ".."
					+ "which pattern matched :" + matcher.group());

		}
		System.out.println("//////////////////////");
		System.out.println("count of occurence: " + count);
	}

}