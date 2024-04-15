package leetcode_medium;
//https://www.youtube.com/watch?v=uX0-xyPkR2w
public class LongestPanlindromSubstring {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(isPalindrom(str));
        ;
    }

    private static String isPalindrom(String str) {

        String ans = "";

        for (int i = 1; i < str.length(); i++) {
            //if palindrom length is odd suppose aba
            int high = i;
            int low = i;

            while (str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == str.length()) {
                    break;
                }
            }
            String palidrom = str.substring(low + 1, high);

            if (palidrom.length() > ans.length()) {
                ans = palidrom;
            }
            //if palindrom length is even suppose bb
            low = i - 1;
            high = i;
            while (str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == str.length()) {
                    break;
                }
            }
            palidrom = str.substring(low + 1, high);

            if (palidrom.length() > ans.length()) {
                ans = palidrom;
            }


        }
        return ans;
    }


}
