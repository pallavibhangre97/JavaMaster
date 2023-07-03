package main.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String argsp[]) {
		String matcherString = "abc@gmail.com";
		String regularExpression = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";
		Pattern pattern = Pattern.compile(regularExpression);
		Matcher matcher = pattern.matcher(matcherString);

		if (matcher.find() && matcher.group().equals(matcherString)) {
			System.out.println("valid email");
		} else {
			System.out.println("Invalid email");
		}

	}
}
