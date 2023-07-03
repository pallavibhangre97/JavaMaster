package practice;

public class ReverseSentenceString {

	public static void main(String[] args) {
		String str = "pallavi is good programmer ";
		String revString = "";
		String srr[] = str.split(" ");
		for (int i = srr.length - 1; i >= 0; i--) {
			revString = revString + srr[i] + " ";
		}
		System.out.println(revString);
	}

}
