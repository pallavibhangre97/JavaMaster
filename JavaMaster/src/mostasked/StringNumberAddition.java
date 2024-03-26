package mostasked;
//supoose i have string s="as12j56" return sum of digit 1+2+5+6

public class StringNumberAddition {
    public static void main(String[] args) {
        String s = "as12j56sddddddd";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                    char ch = s.charAt(i);
                sum = sum + Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
