package java_assesment_14feb;

//given a string which contain * and ? ex string s="***??" you need to return string of corresponding character of count
//ex s="***??" out=cb
public class ConvertStarAndQueTOChar {
    public static void main(String[] args) {
        String str = "***??";
        int star = 0;
        int que = 0;
        String res="";
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == '*') {
                star++;

            } else {
                que++;
            }
        }
       res=res+ (char)(star+96);

        res=res+ (char)(que+96);
        System.out.println(res);



    }
}
