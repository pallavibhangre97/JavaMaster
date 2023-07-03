package mostasked;
/*Write a program to convert the characters of a string into the opposite case, that is, if a character is lowercase, convert it to upper case and vice versa.
 *  scan each character of the string one by one. If the current character is in lowercase, we subtract 32 from the character and convert it to uppercase. Similarly, if the current character is in uppercase, we add 32 to the character and convert it to lowercase.
 * */

public class UpperToLower {

	public static void main(String[] args) {
		String str = "pAllavI";
		StringBuffer sBuffer = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				ch = (char) (ch + 32);
				sBuffer.setCharAt(i, ch);
			} else if (ch >= 97 && ch <= 122) {
				ch = (char) (ch - 32);
				sBuffer.setCharAt(i, ch);
			}
		}
		System.out.println("output string " + sBuffer);
	}

}
