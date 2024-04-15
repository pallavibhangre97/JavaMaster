package leetcode_medium;
//Count Elements With Strictly Smaller and Greater Elements
//https://www.youtube.com/watch?v=H6vghscjMnQ
public class StrictlyGreaterAndSmaller {
    public static void main(String[] args) {
        int num[]={3,3,3,3};
        int count=0;
        int min=num[0],max=num[0];
        for(int a:num)
        {
         min=Math.min(min,a);
         max=Math.max(max,a);
        }
        for(int a:num)
        {
            if(a>min && a<max)
            {
                count++;
            }
        }
        System.out.println("count = "+count);
    }
}
