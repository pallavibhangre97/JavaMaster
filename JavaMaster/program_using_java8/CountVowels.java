package program_using_java8;

import java.util.Arrays;
import java.util.stream.*;
public class CountVowels {
    public static void main(String[] args) {
        String str="sdjasjdbasmdkhaouioa";
        str = str.toLowerCase();

       long  vowels = str.chars().filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')).count();
        System.out.println(vowels);
        System.out.println(countVowel(str));
    }
    public static long countVowel(String str)
    {
      return  str.chars().filter(ch->"aeiouAEIOU".indexOf(ch)!=-1).count();
      //str.chars(); return intstream
    }
}
