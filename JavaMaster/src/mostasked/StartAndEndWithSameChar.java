package mostasked;

public class StartAndEndWithSameChar {
    public static void main(String[] args) {
        String[] str = {"abc", "aba", "zsz", "cvc"};
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            if(s.charAt(0)==s.charAt(s.length()-1))
            {
                System.out.print(s+" ");
            }
        }
    }
}
