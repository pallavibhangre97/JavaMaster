package mostasked;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "i am programmer         v";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				result = result + str.charAt(i);
		}
		System.out.println("String after removing white space " + result);

		// best solution

		str = str.replaceAll("\\s", "");
		System.out.println("String after removing white space " + str);
	}

}
