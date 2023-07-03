package practice;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String string = "pallll       avi";
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				str = str + string.charAt(i);
		}
		System.out.println("String after removing space " + str);
	}

}
