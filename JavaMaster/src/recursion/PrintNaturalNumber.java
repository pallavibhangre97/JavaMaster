package recursion;
//natural number start with 1
public class PrintNaturalNumber {
    public static void main(String args[]) {
        //print 5 natural number so n=5
        printN(5);

    }

    private static void printN(int n) {
        if(n==0)
        {
            return ;
        }
        printN(n-1); //here we want to print so dont return
        System.out.println(n);
    }
}

