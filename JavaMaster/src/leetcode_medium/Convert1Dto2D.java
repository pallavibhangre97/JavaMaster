package leetcode_medium;

import java.util.Arrays;

//https://www.youtube.com/watch?v=h5MUrXHQGs4
public class Convert1Dto2D {
    public static void main(String[] args) {
        int m = 2, n = 3;//m=no of rows ,n=no of colum
        int arr[] = {1, 2, 3, 4};
        if(arr.length!=(m*n))
        {
            System.out.println("it is not possible to convert");
            return;
        }
        int ans[][] = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            int rowIndex = i / n;
            int colIndex = i % n;
            ans[rowIndex][colIndex] = arr[i];
        }
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
