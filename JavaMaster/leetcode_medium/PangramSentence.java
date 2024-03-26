package leetcode_medium;
//https://www.youtube.com/watch?v=rMM8Brb-lko&list=PLpIkg8OmuX-KRHVXwqSixQC9UE6DsHnWa&index=2


//string is pangram only if it contain all english alphabet (either lowercase or uppercase)
public class PangramSentence {
    public static void main(String[] args) {
        String str="abcdefghijkmnopqrstuvwxyza";
        System.out.println(isPanagram(str));

    }
    public static boolean isPanagram(String str){
        int arr[]=new int[26];//take array of size 26 as we have 26 letter and substract 'a' fron all character so we will get index of that char in array
        for(int i=0;i<str.length();i++)
        {
            int a=str.charAt(i)-'a';
            arr[a]=arr[a]+1;
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
