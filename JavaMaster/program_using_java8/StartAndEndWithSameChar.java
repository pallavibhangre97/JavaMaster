package program_using_java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartAndEndWithSameChar {
    public static void main(String[] args) {
        String[] str={"abc","aba","zsz","cvc"};
        List<String> list = Arrays.asList(str);
       List<String> flist= list.stream().filter(ch->ch.length()>0 && ch.endsWith(String.valueOf(ch.charAt(0)))).collect(Collectors.toList());
        for(String s:flist)
        {
            System.out.print(s+" ");
        }
    }

}
