package mostasked;

public class UpperLowerCharString {

	public static void main(String[] args) {
		String str = "pPalla  vi@  ";
		int upper = 0;
		int lower = 0;
		int specChar = 0;
		/*
		 * for (int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if (ch >=
		 * 97 && ch <= 122) { lower++; } else if (ch >= 65 && ch <= 90) upper++; }
		 */
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else {
				specChar++;
			}
		}
		System.out.println("lower char count= " + lower);
		System.out.println("upper char count= " + upper);
		System.out.println("Special char count= " + specChar);
	}

}
