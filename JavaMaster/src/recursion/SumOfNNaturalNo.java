package recursion;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SumOfNNaturalNo {
    public static void main(String[] args) throws NullPointerException {
        int n=5;

        try{
            System.out.println(naturalSum(n));
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //time complexity = o(n) we are calling fun n no of time
        //space complexity =o(n) here we are not using any extra space but internally stack frame is crated for all fun call
    }

    private static int naturalSum(int n) throws FileNotFoundException{
        if(n==1)
            return 1;
       return n+naturalSum(n-1);

    }
}
