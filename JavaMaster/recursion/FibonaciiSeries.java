package recursion;

public class FibonaciiSeries {
    public static void main(String args[]) {
        //without recursion
        int a = 1;
        int b = 1;
        int i = 1;
        int c = a + b;
       // System.out.print(a + " ");
        //System.out.print(b + " ");

        int n = 5; //n means nth number from series
        while (i <= n - 2) {
            c = a + b;
            //System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }

        //with recursion
       // System.out.println();
        for(int k=0;k<n;k++)
        System.out.println(fibo(k));

    }

    public static int fibo(int n) {
        if (n<=1) {
            return n;
        }

return fibo(n - 1) + fibo(n - 2);


    }
}
