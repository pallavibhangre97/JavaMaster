package mostasked;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupString {
    public static void main(String[] args) {
        String str="pallavi";
        Set<Character> set =new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        System.out.println(set.toString());

        //using indexOf
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(ans.indexOf(str.charAt(i))==-1)
            {
                ans=ans+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
