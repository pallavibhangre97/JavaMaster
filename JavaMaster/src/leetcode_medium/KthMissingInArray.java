package leetcode_medium;

import java.util.ArrayList;
//array is in sorted array
//series starts with 1 so i have initialize ans =1;
//if array contain ans then simply increse ans and i and if it is missing add to list so we have list of missing element
//we can fetch from list kth missing

public class KthMissingInArray {
    public static void main(String[] args) {
        int arr[]={2, 3, 5, 9, 10, 11, 12};
        int k=4;
        kthMissing(arr,k);
    }

    private static void kthMissing(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int ans=1;
        while(i<arr.length)
        {
            if(ans!=arr[i])
            {
                list.add(ans);
                ans++;
            }
            else {
                i++;
                ans++;
            }
        }
        System.out.println(list);
        System.out.println("Kth missing from array = " + list.get(k-1));
    }
}
