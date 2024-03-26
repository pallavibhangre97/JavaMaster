package leetcode.easy;

//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
//https://www.youtube.com/watch?v=iWNFp4YL4I0&list=PLjOcsOwEjb12kPbh4f1BjWh-sao0tX-Md&index=2
public class WordPrefixInSentence {

	public static void main(String args[]) {
		String sentence = "i love eating burger", searchWord = "burg";
		System.out.println(isPrefix(sentence, searchWord));
	}

	private static int isPrefix(String sentence, String searchWord) {
		String arr[] = sentence.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith(searchWord)) {
				return i + 1;
			}
		}
		return -1;

	}
}
