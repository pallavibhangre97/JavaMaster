package leetcode_medium;

import java.util.*;

//https://www.youtube.com/watch?v=cRBSOz49fQk
public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
      List<List<Integer>> list =  threeSum(arr);
        System.out.println(list);
    }

    public static List<List<Integer>> threeSum(int arr[]) {
        if (arr == null || arr.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(arr);
        Set<List<Integer>> set = new HashSet<>();
        int left = 0, right = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[right] + arr[left];
                if (sum == 0) {
                    set.add(Arrays.asList(arr[i], arr[right], arr[left]));
                    right--;
                    left++;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }


        }
        System.out.println(set);
        return new ArrayList<>(set);
    }
}

