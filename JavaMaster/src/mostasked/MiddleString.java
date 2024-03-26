package mostasked;
/*
To return true only if Sony is found in middle:
https://www.youtube.com/watch?v=ucVHqMYG1I0&list=PL4XiGI8JU8ZDpDZumND1XgbRuHNKYZG-E&index=1
 */
public class MiddleString {
    public static void main(String[] args) {
        String str="ddsonymada";
        String strTOFInd="sony";
        str=str.toLowerCase();
        str=str.substring(1,str.length()-2);
        if(str.contains(strTOFInd))
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static void isMiddle1() {
        String str = "wewe";
        String charToBeChekd = "SONr";

        int charBefoeStr = str.indexOf(charToBeChekd);
        int charAfterStr = str.length() - charBefoeStr - charToBeChekd.length();

        System.out.println("BEFORE: " + charBefoeStr + " AFTER: " + charAfterStr);
        if (charAfterStr == charBefoeStr) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

}
