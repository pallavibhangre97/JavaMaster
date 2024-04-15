package leetcode_medium;

import java.util.Arrays;

///Pair with largest sum which is less than K in the array
public class SumLessThanK {
    public static void main(String[] args) {
       int arr[] = {5, 20, 110, 100, 10};
       int k=85;
       sumLessK(arr,k);
    }

    private static void sumLessK(int[] arr, int k) {
        Arrays.sort(arr);
          int maxsum=0,left=0,right=arr.length-1;
          int a=0,b=0;
          while(left<right){
              int sum=arr[left]+arr[right];
              if(sum<k && sum>maxsum)
              {
              maxsum=sum;
              a=arr[left];
              b=arr[right];
              left++;
              right--;
              }else if(sum<k)
              {
                  left++;
              }
              else {
                  right--;
              }
          }
        System.out.println(a+" "+b);
    }
}
