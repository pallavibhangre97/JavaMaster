package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

	/*
	 * public static void main(String[] args) { int i = 0; boolean b = false; String
	 * string = "()";
	 * 
	 * while (i != string.length() - 2) { System.out.println("i=" + i);
	 * 
	 * if ((string.charAt(i) == '(') && (string.charAt(i + 1) == ')')) { b = true;
	 * // System.out.println("in if b=" + b);
	 * 
	 * i += 2; } else if ((string.charAt(i) == '[') && (string.charAt(i + 1) ==
	 * ']')) { b = true; // System.out.println("in if b=" + b);
	 * 
	 * i += 2;
	 * 
	 * }
	 * 
	 * else if ((string.charAt(i) == '{') && (string.charAt(i + 1) == '}')) { b =
	 * true; // System.out.println("in if b=" + b);
	 * 
	 * i += 2;
	 * 
	 * }
	 * 
	 * else { b = false; break; }
	 * 
	 * } if (b == true) { System.out.println("true"); } else {
	 * System.out.println("false");
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("char c:" + c);
			if (c == '(' || c == '{' || c == '[') {
				stack.add(c);
				System.out.println("added" + c);
			} else {
				if (stack.isEmpty()) {
					System.out.println("empty");
					return false;
				}
				if (c == ')' && stack.peek() != '(') {
					System.out.println("peek is not eqiual )");
					return false;
				}
				if (c == ']' && stack.peek() != '[') {
					System.out.println("peek is not eqiual ]");
					return false;
				}
				if (c == '}' && stack.peek() != '{') {
					System.out.println("peek is not eqiual }");
					return false;
				}
				stack.pop();
				System.out.println("pooped ");
			}
		}
		return stack.isEmpty();
	}

}
