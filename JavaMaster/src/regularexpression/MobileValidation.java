package main.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {
	public static void main(String argsp[]) {
		String matcherString = "009199199383";
		String regularExpression = "(0|91)?[789][0-9]{9}";
		Pattern pattern = Pattern.compile(regularExpression);
		Matcher matcher = pattern.matcher(matcherString);

		if (matcher.find() && matcher.group().equals(matcherString)) {
			System.out.println("valid Mobile number");
		} else {
			System.out.println("Invalid Mobile number");
		}

	}

}
